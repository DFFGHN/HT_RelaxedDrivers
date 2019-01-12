package com.aaa.demo.entity;

public class Sysusers {
    private Integer uno;
    private String uname;
    private String upwd;
    private Integer rno;
    private String rname;
    public Sysusers() {
    }

    public Sysusers(Integer uno, String uname, String upwd) {
        this.uno = uno;
        this.uname = uname;
        this.upwd = upwd;
    }

    public Integer getUno() {
        return uno;
    }

    public void setUno(Integer uno) {
        this.uno = uno;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "Sysusers{" +
                "uno=" + uno +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", rno=" + rno +
                ", rname='" + rname + '\'' +
                '}';
    }
}
