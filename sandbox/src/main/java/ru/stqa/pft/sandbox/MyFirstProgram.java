package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args){
        hello("world");

        Square s = new Square(5);
        System.out.println("Площа квадрата зі стороною " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площа прямокутника зі сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p1 = new Point(3, 5, 6, 7);
        //Point p2 = new Point(6, 7);

        System.out.println("Distance between points " + p1.x1 + " " + p1.y1 + " and " + p1.x2 + " " + p1.y2 + " is = " + p1.distance());
    }





    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }



}
