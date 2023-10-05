package com.pluralsight;
public class MathApp {

    public static void main(String[] args){
        double bobSalary= 80000;
        double garySalary= 120000;
        double highestSalary= Math.max(bobSalary,garySalary);

        System.out.println("The highest salary is " + highestSalary + ".");

        double carPrice= 10800;
        double truckPrice = 20650;
        double lowestPrice = Math.min(carPrice,truckPrice);

        System.out.println("The lowest price is "+ lowestPrice + "." );

        double radius = 7.25;
        double area= radius*radius* Math.PI;
        System.out.println(area);

        double x=5.0;
        double sqrtX = Math.sqrt(x);
        System.out.println(sqrtX);

        double startX = 5, startY= 10;
        double endX = 85 , endY= 50;
        double distanceX= endX-startX , distanceY= endY-startY;
        double distance= Math.sqrt ((distanceX*distanceX)+ (distanceY*distanceY));
        System.out.println("The distance between the two points is " + distance + ".");

        double A = -3.8;
        double absoluteValueA = Math.abs(A);
        System.out.println(absoluteValueA);

        double random = Math.random();
        System.out.println(random); // different everytime it is run



    }
}

