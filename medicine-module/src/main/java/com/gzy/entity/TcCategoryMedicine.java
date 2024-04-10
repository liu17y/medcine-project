package com.gzy.entity;

import java.io.Serializable;

/**
 * (TcCategoryMedicine)实体类
 *
 * @author makejava
 * @since 2023-12-08 21:48:05
 */
public class TcCategoryMedicine implements Serializable {
    private static final long serialVersionUID = -57605605106188660L;

    private Integer id;

    private String category;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}

