package com.company;

public class SquareX extends Figures {
    double a;
    String color;

    public SquareX() {
        this.a = generateSide();
        this.color = generateColor();
    }

    @Override
    public double area() {
        return a * a;
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

    public String getColor() {
        return color;
    }

    public void setA(double a) {
        this.a = a;
    }



    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square. Side: " + getA()  + " Area: " + area() + " Color: " + getColor();
    }

    public double generateSide(){
        double a = 1 + Math.random()*100;

        return a;
    }


    public String generateColor() {
        String[] col = new String[]{"black","yellow","blue","red","green","white"};

        int a = (int) (Math.random() * 6);
        return col[a];
    }
}


