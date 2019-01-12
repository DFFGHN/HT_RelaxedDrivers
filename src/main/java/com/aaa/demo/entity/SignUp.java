package com.aaa.demo.entity;

import java.util.Date;

public class SignUp {
    private Integer signo;
    private Integer userno;
    private Integer driverno;
    private Integer schoolno;
    private Integer mealno;
    private String paytype;
    private Date sigtime;
    private String state;

    public SignUp() {
    }

    public SignUp(Integer signo, Integer userno, Integer driverno, Integer schoolno, Integer mealno, String paytype, Date sigtime, String state) {
        this.signo = signo;
        this.userno = userno;
        this.driverno = driverno;
        this.schoolno = schoolno;
        this.mealno = mealno;
        this.paytype = paytype;
        this.sigtime = sigtime;
        this.state = state;
    }

    public Integer getSigno() {
        return signo;
    }

    public void setSigno(Integer signo) {
        this.signo = signo;
    }

    public Integer getUserno() {
        return userno;
    }

    public void setUserno(Integer userno) {
        this.userno = userno;
    }

    public Integer getDriverno() {
        return driverno;
    }

    public void setDriverno(Integer driverno) {
        this.driverno = driverno;
    }

    public Integer getSchoolno() {
        return schoolno;
    }

    public void setSchoolno(Integer schoolno) {
        this.schoolno = schoolno;
    }

    public Integer getMealno() {
        return mealno;
    }

    public void setMealno(Integer mealno) {
        this.mealno = mealno;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public Date getSigtime() {
        return sigtime;
    }

    public void setSigtime(Date sigtime) {
        this.sigtime = sigtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "SignUp{" +
                "signo=" + signo +
                ", userno=" + userno +
                ", driverno=" + driverno +
                ", schoolno=" + schoolno +
                ", mealno=" + mealno +
                ", paytype='" + paytype + '\'' +
                ", sigtime=" + sigtime +
                ", state='" + state + '\'' +
                '}';
    }
}
