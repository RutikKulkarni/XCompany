package com.crio.xcompany.company;


import java.util.*;
public class Employee {
    private String name;
    private Gender gender;


    public Employee(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return "Employee [name=" + name + ", gender=" + gender + "]";
    }

    void assignManager(Employee employee){
        
    }

    List getDirectReports(){
        return new ArrayList<Integer>();
    }

    List getTeamMates(){
        return new ArrayList<Integer>();
    }
}