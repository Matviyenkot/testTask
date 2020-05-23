package com.company;

import java.util.Objects;

public class Circle extends Figures {
   double r;
   String color;
   final double Pi = 3.1415d;

    public Circle() {
        this.r = Objects.requireNonNull(generateRadius());
        this.color =Objects.requireNonNull(generateColor());
    }

    @Override
    public double area(){
        return  Pi*r*r;
   }


    @Override
   public void draw(Figures obj){
       System.out.println("Object: " + obj);
   }

   @Override
   public void color(String c){
       color = c;
   }

   public double getR(){
       return r;
   }
   public String getColor(){
       return color;
   }

   public void setR(double r){
       this.r = r;
   }

   public void setColor(String color){
       this.color = color;
   }

    @Override
    public String toString() {
        return "Circle. Radius: " + getR()  + " Area: " + area() + " Color: " + getColor();
    }
    public double generateRadius(){
        double a = 1 + Math.random()*100;

        return a;
    }


    public String generateColor() {
        String[] col = new String[]{"black","yellow","blue","red","green","white"};

        int a = (int) (Math.random() * 6);
        return col[a];
    }
}



