package com.aaa.demo.entity;

public class Relationship {
    private Integer reno;
    private Integer rno;
    private Integer pno;

    public Relationship() {
    }

    public Relationship(Integer reno, Integer rno, Integer pno) {
        this.reno = reno;
        this.rno = rno;
        this.pno = pno;
    }

    public Integer getReno() {
        return reno;
    }

    public void setReno(Integer reno) {
        this.reno = reno;
    }

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public Integer getPno() {
        return pno;
    }

    public void setPno(Integer pno) {
        this.pno = pno;
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "reno=" + reno +
                ", rno=" + rno +
                ", pno=" + pno +
                '}';
    }
}
