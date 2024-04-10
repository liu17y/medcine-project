package com.gzy.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MenuVo {
    private Integer id;
    private String title;
    private String icon;
    private List<MenuItem> children;

    public void addChild(MenuItem child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
    }

}
