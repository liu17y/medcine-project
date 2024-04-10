package com.gzy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IPDto {
    private String netInterface;// 网络
    private String ip;
    private String host_name;


}
