package com.wen.test.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Users implements Serializable {

    private String username;
    private Integer age;
    private Date birthday;





}
