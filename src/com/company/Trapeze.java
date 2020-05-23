package com.company;

import java.util.Objects;

public class Trapeze extends Figures {
    double a, b, h;
    String color;

    public Trapeze() {
        this.a = Objects.requireNonNull(generateSide1()) ;
        this.b = Objects.requireNonNull(generateSide2());
        this.h = Objects.requireNonNull(generateHeight());
        this.color = Objects.requireNonNull(generateColor()) ;
    }

    @Override
    public double area(){
        return (a+b)/2*h;
    }

    @Override
    public void draw(Figures obj){
        System.out.println("Object: " + obj);
    }

    @Override
    public void color(String c){
        color = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getH() {
        return h;
    }
    public String getColor() {
        return color;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Trapeze. Base 1: " + getA() + " Base 2: " + getB() + " Height: " + getH()  + " Area: " + area() + " Color: " + getColor();
    }

    public double generateSide1(){
        double a = 1 + Math.random()*100;

        return a;
    }

    public double generateSide2(){
        double b = 1 + Math.random()*100;

        return b;
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


  /*  public Trapeze() {
        this.a = generateSide1();
        this.b = generateSide2();
        this.h = generateHeight();
        this.color = generateColor();
    }*/