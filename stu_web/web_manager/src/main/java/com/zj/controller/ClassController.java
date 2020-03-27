package com.zj.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zj.entity.Classes;
import com.zj.service.IClsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author zhangjun
 * @Date 2020/3/26
 */
@Controller
@RequestMapping("/cls")
public class ClassController {

    //获取业务对象
    @Reference
    private IClsService clsService;

    /**
     * 获取班级信息
     * @return
     */
    @RequestMapping("list")
    public String list(Model model){
        //调用班级服务
        List<Classes> classesList = clsService.getList();
        model.addAttribute("classesList",classesList);
        return "clsList";
    }
}
