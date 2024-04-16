package com.jeepcode.JeepCode.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "jeepcodes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class JeepCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private String code;
    private String des1;
    private String des2;
    private String des3;
    private String des4;
    private String des5;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDes1() {
        return des1;
    }
    public void setDes1(String des1) {
        this.des1 = des1;
    }
    public String getDes2() {
        return des2;
    }
    public void setDes2(String des2) {
        this.des2 = des2;
    }
    public String getDes3() {
        return des3;
    }
    public void setDes3(String des3) {
        this.des3 = des3;
    }
    public String getDes4() {
        return des4;
    }
    public void setDes4(String des4) {
        this.des4 = des4;
    }
    public String getDes5() {
        return des5;
    }
    public void setDes5(String des5) {
        this.des5 = des5;
    }
}
