package com.company;

public class Studeent {

    private String name;
    private int age;
    private String rost;

    public Studeent() {
    }

    public Studeent(String name, int age, String rost) {
        this.name = name;
        this.age = age;
        this.rost = rost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getRost() {
        return rost;
    }

    public void setRost(String rost) {
        this.rost = rost;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println(age);
        } else {
            this.age = age;
        }


    }
    void student(){
        System.out.println(getName()+getRost()+getAge());
    }
    }



