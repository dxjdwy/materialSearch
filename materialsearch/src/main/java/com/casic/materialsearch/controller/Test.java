package com.casic.materialsearch.controller;

import com.casic.materialsearch.utils.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String sql = "insert into User (userName,email,age) values (?,?,?)";
        List<Object> list = new ArrayList<>();
        list.add("andy");
        list.add("andy.zhu@cdskysoft.com");
        list.add(29);
        try {
            System.out.println(DBUtils.update(sql,list));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
