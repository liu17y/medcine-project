package com.gzy.entity;

import java.io.Serializable;

/**
 * (WCategoryMedincine)实体类
 *
 * @author makejava
 * @since 2023-12-08 21:48:23
 */
public class WCategoryMedincine implements Serializable {
    private static final long serialVersionUID = -65267806297204714L;

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

