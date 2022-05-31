package com.aclabs.aclabs2022.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "student", schema = "student")
public class Student {

    @Id
    private String id;
    private String name;
    private Integer age;

}