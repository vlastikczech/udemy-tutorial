package com.company;

public class Student {
    private String name;
    private String address = "";
    private String SSN;
    private String emailID;
    private static String  studentID;

    public Student(String name, String SSN){
        this.name = name;
        this.SSN = SSN;
        emailID = name + "@maricopa.edu";
        studentID = (int) (Math.random() * 10000)  + SSN.substring(0,4);
    }

    public String setAddress(String city, String state, String zipcode){
        return address = city + ", " + state + ", " + zipcode;
    }

    public String toString(){
        return "[Student ID: " + studentID +"]\n" + "[Student Email: "+ emailID +"]\n" + "[Student Name: " +name
                +"]\n" + "[Student Address: " + address + "]";
    }
}
