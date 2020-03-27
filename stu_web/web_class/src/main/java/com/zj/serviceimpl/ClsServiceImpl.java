package com.zj.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zj.dao.ClsMapper;
import com.zj.entity.Classes;
import com.zj.entity.Student;
import com.zj.service.IClsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author zhangjun
 * @Date 2020/3/27
 */
@Service
public class ClsServiceImpl implements IClsService {

    @Autowired
    private ClsMapper clsMapper;


    /**
     * 获取所有班级信息表
     * @return
     */
    @Override
    public List<Classes> getList() {
        List<Classes> classes = clsMapper.selectList(null);
        return classes;
    }

    /**
     * 通过id获取班级信息
     * @param id
     * @return
     */
    @Override
    public Classes getClassesById(Integer id) {
        Classes classes = clsMapper.selectById(id);
        return classes;
    }

    @Override
    public void incrCnumById(Student student) {
        Classes classes = new Classes();
        classes.setId(student.getCid());
        Classes classes1 = clsMapper.selectById(student.getCid());
        int cnum = classes1.getCnum();
        classes.setCnum(cnum+1);
        clsMapper.updateById(classes);
    }
}
