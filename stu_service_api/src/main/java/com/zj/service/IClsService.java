package com.zj.service;

import com.zj.entity.Classes;
import com.zj.entity.Student;

import java.util.List;

/**
 * @Author zhangjun
 * @Date 2020/3/27
 */
public interface IClsService {
    /**
     * 获取所有班级信息
     * @return
     */
    List<Classes> getList();

    Classes getClassesById(Integer id);

    void incrCnumById(Student student);
}
