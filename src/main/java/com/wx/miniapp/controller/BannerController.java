package com.wx.miniapp.controller;

import com.wx.miniapp.config.FileConfig;
import com.wx.miniapp.domain.MallDO;
import com.wx.miniapp.service.MallService;
import com.wx.miniapp.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 商店信息
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/22 14:46
 */
@Controller
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    private MallService mallService;

    @Autowired
    private FileConfig fileConfig;

    @ResponseBody
    @GetMapping("/list")
    public PageUtil list(@RequestParam Map<String, Object> params) {
        // 查询列表数据
        Query query = new Query(params);
        List<MallDO> MallList = mallService.list(query);
        int total = mallService.count(query);
        PageUtil pageUtils = new PageUtil(MallList, total);
        Iterator its=pageUtils.getRows().iterator();
        MallDO mall= (MallDO) its.next();
        String mall_name=mall.getName();
        return pageUtils;
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @ResponseBody
    public MallDO info(@PathVariable("id") Long id) {
        MallDO mall = mallService.get(id);
        //return R.ok().put("mall", mall);
        return mall;
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    public R save(MallDO Mall) {
        if (mallService.save(Mall) > 0) {
            return R.ok();
        }
        return R.error();
    }
    /**
     * 修改
     */
    @RequestMapping("/update")
    @ResponseBody
    public R update(@RequestBody MallDO mall) {
        mallService.update(mall);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
    public R remove(Long id) {
        if (mallService.remove(id) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/batchRemove")
    @ResponseBody
    public R remove(@RequestParam("ids[]") Long[] ids) {
        mallService.batchRemove(ids);
        return R.ok();
    }

    /***
     * 上传商家图片
     *
     * @param file
     * @param request
     * @return
     */
    @ResponseBody
    @PostMapping("/upload")
    R upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String fileName = file.getOriginalFilename();
        System.out.println("fileName:"+fileName);
        fileName = FileUtil.renameToUUID(fileName);
        System.out.println("fileName1:"+fileName);
        MallDO mall = new MallDO(FileType.fileType(fileName), "/files/" + fileName, new Date());
        System.out.println("fileName1:"+mall.getUrl());
        try {
            FileUtil.uploadFile(file.getBytes(), fileConfig.getUploadPath(), fileName);
        } catch (Exception e) {
            return R.error();
        }
        System.out.println("sssss:");
        if (mallService.save(mall) > 0) {
            return R.ok().put("fileName",mall.getUrl());
        }
        return R.error();
    }
}
