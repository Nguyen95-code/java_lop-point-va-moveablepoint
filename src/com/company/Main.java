package com.company;

public class Main {

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(3, 5);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(3, 5, 7, 9);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
