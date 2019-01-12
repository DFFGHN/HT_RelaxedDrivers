package com.aaa.demo.entity;

import java.util.List;

public class Privilegs {
    private Integer pno;
    private String pname;
    private String purl;
    private Integer parentno;
    private String pimg;

    private List<Privilegs> subPrivilegs;

    public Privilegs() {
    }

    public Privilegs(Integer pno, String pname, String purl, Integer parentno, String pimg) {
        this.pno = pno;
        this.pname = pname;
        this.purl = purl;
        this.parentno = parentno;
        this.pimg = pimg;
    }

    public Integer getPno() {
        return pno;
    }

    public void setPno(Integer pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    public Integer getParentno() {
        return parentno;
    }

    public void setParentno(Integer parentno) {
        this.parentno = parentno;
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg;
    }

    public List<Privilegs> getSubPrivilegs() {
        return subPrivilegs;
    }

    public void setSubPrivilegs(List<Privilegs> subPrivilegs) {
        this.subPrivilegs = subPrivilegs;
    }

    @Override
    public String toString() {
        return "Privilegs{" +
                "pno=" + pno +
                ", pname='" + pname + '\'' +
                ", purl='" + purl + '\'' +
                ", parentno=" + parentno +
                ", pimg='" + pimg + '\'' +
                ", subPrivilegs=" + subPrivilegs +
                '}';
    }
}
