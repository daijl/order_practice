package com.djl.dd.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

 @Data
 @AllArgsConstructor
 @NoArgsConstructor
public class User {
    private int id;
    private String phone;
    private String name;
    private String password;
}
