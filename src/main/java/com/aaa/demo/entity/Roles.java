package com.aaa.demo.entity;

public class Roles {
    private Integer rno;
    private String rname;

    public Roles() {

    }
    public Roles(Integer rno, String rname) {
        this.rno = rno;
        this.rname = rname;
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
        return "Roles{" +
                "rno=" + rno +
                ", rname='" + rname + '\'' +
                '}';
    }
}
