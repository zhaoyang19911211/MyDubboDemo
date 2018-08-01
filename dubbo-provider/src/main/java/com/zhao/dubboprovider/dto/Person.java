package com.zhao.dubboprovider.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    private int pid;
    private String pname;
    private String skill;
    public Person() {
    }
    public Person(int pid, String pname, String skill) {
        this.pid = pid;
        this.pname = pname;
        this.skill = skill;
    }
}