package com.ym.entity;

import java.util.Date;

public class TeacherVo {

    private Integer t_id;

    private String t_name;

    private String t_sex;

    private String t_age;

    private String t_phone;

    private String t_address;

    private Integer dept_id;

    private Date c_time;

    private Date m_time;

    private String deltag;

    private String dept_name;

    public TeacherVo() {
    }

    public TeacherVo(Integer t_id, String t_name, String t_sex, String t_age, String t_phone, String t_address, Integer dept_id, Date c_time, Date m_time, String deltag, String dept_name) {
        this.t_id = t_id;
        this.t_name = t_name;
        this.t_sex = t_sex;
        this.t_age = t_age;
        this.t_phone = t_phone;
        this.t_address = t_address;
        this.dept_id = dept_id;
        this.c_time = c_time;
        this.m_time = m_time;
        this.deltag = deltag;
        this.dept_name = dept_name;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_sex() {
        return t_sex;
    }

    public void setT_sex(String t_sex) {
        this.t_sex = t_sex;
    }

    public String getT_age() {
        return t_age;
    }

    public void setT_age(String t_age) {
        this.t_age = t_age;
    }

    public String getT_phone() {
        return t_phone;
    }

    public void setT_phone(String t_phone) {
        this.t_phone = t_phone;
    }

    public String getT_address() {
        return t_address;
    }

    public void setT_address(String t_address) {
        this.t_address = t_address;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public Date getC_time() {
        return c_time;
    }

    public void setC_time(Date c_time) {
        this.c_time = c_time;
    }

    public Date getM_time() {
        return m_time;
    }

    public void setM_time(Date m_time) {
        this.m_time = m_time;
    }

    public String getDeltag() {
        return deltag;
    }

    public void setDeltag(String deltag) {
        this.deltag = deltag;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
}
