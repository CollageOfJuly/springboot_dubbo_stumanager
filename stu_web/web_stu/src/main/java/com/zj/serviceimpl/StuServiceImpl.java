package com.zj.serviceimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.zj.dao.StuMapper;
import com.zj.entity.Classes;
import com.zj.entity.Student;
import com.zj.service.IClsService;
import com.zj.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author zhangjun
 * @Date 2020/3/27
 */
@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;

    @Reference
    private IClsService clsService;

    /**
     * 获取学生列表
     * @return
     */
    @Override
    public List<Student> list() {

        List<Student> students = stuMapper.selectList(null);
        for (Student student : students) {
            Integer cid = student.getCid();
            Classes classes = clsService.getClassesById(cid);
            student.setClasses(classes);
        }
        return students;
    }

    /**
     * 添加学生信息
     * @param student
     */
    @Override
    @Transactional
    public void insert(Student student) {
        stuMapper.insert(student);
        clsService.incrCnumById(student);
    }
}
