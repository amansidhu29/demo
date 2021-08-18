package com.example.demo;

import jdk.jfr.Category;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseInterface {

    public void add(Category cat)throws ClassNotFoundException, SQLException;
    public Category edit(Category cat, String catcode)throws ClassNotFoundException,SQLException;
    public void delete(String catcode) throws SQLException;
    public List<Category> display() throws ClassNotFoundException,SQLException;
}
