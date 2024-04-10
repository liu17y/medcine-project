package com.gzy.dto;

import com.gzy.entity.User;

import java.io.Serializable;

public class UserDto extends User implements Serializable {

    /**
     * 验证码
     */
    private String verificationCode;

    private String publicIp;

    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
