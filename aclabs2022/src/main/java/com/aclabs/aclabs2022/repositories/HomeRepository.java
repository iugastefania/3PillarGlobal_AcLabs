package com.aclabs.aclabs2022.repositories;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HomeRepository {

    List<String> list = new ArrayList<>();

    public HomeRepository(){
        list.add("Hello World!");
    }

    public String getFirstString(){
        return list.get(0);
    }

    public List<String> getAllStrings() {
        return list;
    }

    public void addString(String string) {
        list.add(string);
    }
}