package com.test.demo.Entity;

public class TestEntity {
    private int id;
    private String name;
    private boolean isTest;

    public TestEntity() {
    }

    public TestEntity(int id, String name, boolean isTest) {
        this.id = id;
        this.name = name;
        this.isTest = isTest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTest() {
        return isTest;
    }

    public void setTest(boolean test) {
        isTest = test;
    }
}
