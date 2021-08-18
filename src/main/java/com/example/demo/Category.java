package com.example.demo;

public class Category {
    private String catcode;
    private String catdesc;

   //generated  constructor
    public String getCatcode() {
        return catcode;
    }
    // generated getters and setters

    public void setCatcode(String catcode) {
        this.catcode = catcode;
    }
    public String getCatdesc() {
        return catdesc;
    }
    public void setCatdesc(String catdesc) {
        this.catdesc = catdesc;
    }
    public Category(String catcode, String catdesc) {
        this.catcode = catcode;
        this.catdesc = catdesc;
    }
}
