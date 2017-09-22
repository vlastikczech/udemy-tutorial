package com.company;

public class Main {

    public static void main(String[] args) {
	    Student std1 = new Student("Jess" , "657468790");
	    std1.setAddress("Mesa", "Arizona" , "85234");
        System.out.println(std1.toString());
    }
}
