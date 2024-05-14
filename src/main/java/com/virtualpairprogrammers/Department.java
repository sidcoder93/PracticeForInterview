package com.virtualpairprogrammers;

public class Department {

    private int departmentId;
    private String departmentnName;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentnName() {
        return departmentnName;
    }

    public Department(int departmentId, String departmentnName) {
        this.departmentId = departmentId;
        this.departmentnName = departmentnName;
    }

    public void setDepartmentnName(String departmentnName) {
        this.departmentnName = departmentnName;


    }

    public Department(){}
}
