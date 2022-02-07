package com.company;

public class Televizor {
    private String name;
    private String diogonal;
    private String color;
    private int price;

    public Televizor(String name, String diogonal, String color, int price) {
        this.name = name;
        this.diogonal = diogonal;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiogonal() {
        return diogonal;
    }

    public void setDiogonal(String diogonal) {
        this.diogonal = diogonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    }
