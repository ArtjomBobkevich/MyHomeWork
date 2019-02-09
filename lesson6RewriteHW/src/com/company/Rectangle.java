package com.company;

public class Rectangle {

    private Point point1;
    private Point point2;

    public Rectangle (Point point1,Point point2){
        this.point1=point1;
        this.point2=point2;
    }

    public double yardageRectangle() {
        return (point2.getX()-point1.getX())*(point2.getY()-point1.getY());
    }

    public double lengthDiagonals() {
        return point1.distance(point2);
    }
}