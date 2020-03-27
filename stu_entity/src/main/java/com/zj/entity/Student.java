package com.zj.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author zhangjun
 * @Date 2020/3/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student extends BaseEntity {
    private String sname;
    private Integer age;
    private Integer cid;
    @TableField(exist = false)
    private Classes classes;
}
