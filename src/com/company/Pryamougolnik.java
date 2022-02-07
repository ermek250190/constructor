package com.company;

public class Pryamougolnik {
    private String name;
    private String dlina;
    private String color;
    private int ves;

    public Pryamougolnik() {
    }

    public Pryamougolnik(String name, String dlina, String color, int ves) {
        this.name = name;
        this.dlina = dlina;
        this.color = color;
        this.ves = ves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDlina() {
        return dlina;
    }

    public void setDlina(String dlina) {
        this.dlina = dlina;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }
}
