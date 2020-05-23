package com.company;

import java.util.Objects;

public class Triangle extends Figures {
    double a, h;
    String color;

    public Triangle() {
        this.a = Objects.requireNonNull(generateSide());
        this.h = Objects.requireNonNull(generateHeight());
        this.color = Objects.requireNonNull(generateColor());
    }

    @Override
    public double area() {
        return a * h / 2;
    }

    @Override
    public void draw(Figures obj) {
        System.out.println("Object: " + obj);
    }

    @Override
    public void color(String c) {
        color = c;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    public String getColor(){
        return color;
    }

    public void setA(double a){
        this.a = a;
    }

    public void setH(double h){
        this.h = h;
     }

     public void setColor(String color){
        this.color = color;
     }

     @Override
    public String toString(){
        return "Triangle. Side: " + getA() + " Height " + getH()  + " Area: " + area() + " Color: " + getColor();
     }
    public double generateSide(){
        double a = 1 + Math.random()*100;

        return a;
    }

    public double generateHeight(){
        double h = 1 + Math.random()*100;

        return h;
    }

    public String generateColor() {
        String[] col = new String[]{"black","yellow","blue","red","green","white"};

        int a = (int) (Math.random() * 6);
        return col[a];
    }
}


   /* public Triangle() {
        this.a = generateSide();
        this.h = generateHeight();
        this.color = generateColor();
    }*/
