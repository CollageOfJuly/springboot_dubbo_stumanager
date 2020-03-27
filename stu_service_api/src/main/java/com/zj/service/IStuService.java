package com.zj.service;

import com.zj.entity.Student;

import java.util.List;

/**
 * @Author zhangjun
 * @Date 2020/3/27
 */
public interface IStuService {
    /**
     * 获取学生列表
     * @return
     */
    List<Student> list();

    void insert(Student student);
}
