package com.zj.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zj.entity.Student;
import com.zj.service.IStuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author zhangjun
 * @Date 2020/3/27
 */
@Controller
@RequestMapping("/stu")
public class StuController {

    //获取学生业务对象
    @Reference
    private IStuService stuService;

    /**
     * 获取学生信息
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String getList(Model model){
        //获取学生信息列表
        List<Student> stuList = stuService.list();
        model.addAttribute("stuList",stuList);
        return "stuList";
    }

    /**
     * 添加学生信息
     * @return
     */
    @RequestMapping("/toadd")
    public String toAdd(){
        return "addStu";
    }

    @RequestMapping("/add")
    public String add(Student student){
        stuService.insert(student);
        return "redirect:/stu/list";
    }
}
