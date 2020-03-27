package com.zj.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zhangjun
 * @Date 2020/3/26
 */
@Data
public class BaseEntity implements Serializable {
    protected int id;
}
