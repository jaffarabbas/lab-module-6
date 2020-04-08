package com.company;

import java.util.Scanner;
import java.util.Random;
class Gemetric{
    private double side1;
    private double side2;
    private double side3;
    
    public void side1(double side1){
        side1 = side1;
    }
    public double setside1(double side1){
        this.side1 = side1;
        return side1;
    }
    public void side2(double side2){
        side2 = side2;
    }
    public double setside2(double side2){
        this.side2 = side2;
        return side2;
    }
    public void side3(double side3){
        side3 = side3;
    }
    public double setside3(double side3){
        this.side3 = side3;
        return side3;
    }
}
class Triangle extends Gemetric{
    Scanner obj = new Scanner(System.in);
    String color;
    boolean state;
    double a,b,c;
    double total;

    public double side1;
    public double side2;
    public double side3;

    Triangle(){
        System.out.println("Default : ");
        side1 = setside1(1.0f);
        side2 =setside2(1.0f);
        side3 =setside3(1.0f);
        System.out.println(toString());
        this.getPerimeter();
        this.getArea();
        System.out.print("Color is not filled");
        System.out.print("State : ");
        System.out.println(state=false);
    }

    Triangle(double sides1,double sides2,double sides3){
        setside1(sides1);
        setside2(sides2);
        setside3(sides3);
        side1 = setside1(sides1);
        side2 = setside2(sides2);
        side3 = setside3(sides3);
    }

    double getArea(){
        this.getPerimeter();
        double temp = total * (total - side1) * (total - side2) * (total - side3);
        double area = Math.sqrt(temp);
        return area;   
    }
    
    public void getPerimeter(){
          total = side1 + side2 + side3;
          System.out.println("Total Perimeter : "+total);
    }
    public String toString(){
        return "Triangle :  \n"+side1+"\n"+side2+"\n"+side3;
    }
}

class testclass extends Triangle{
    Scanner obj = new Scanner(System.in);
    testclass(){
        super();
    }
    testclass(double a,double b,double c){
        super(a,b,c);
    }
    void Reuse(){
        getPerimeter();
    }
}

class input extends Triangle{
    Scanner scn = new Scanner(System.in);
    void sides(){
        System.out.println("Enter Side 1");
        a=scn.nextDouble();
        System.out.println("Enter Side 2");
        b=scn.nextDouble();
        System.out.println("Enter Side 3");
        c=scn.nextDouble();
        System.out.println("Enter Color : ");
        color = scn.next();
        System.out.println("Color : "+color);
        state = false;
        if(color == null){
              System.out.println(state);
        }
        else{
            System.out.println(true+"   Filled");
        }
        testclass obj = new testclass(a,b,c);
        System.out.println(obj.toString());
        System.out.println("Area : "+obj.getArea());
    }
}

class WeekActivity8
{
	public static void main(String[] args) {
        input obj = new input();
        obj.sides();
	}
}

