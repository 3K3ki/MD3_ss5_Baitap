package Baitap1;

public class Cricle {
    String color;
    private double radius = 1.0 ;

    public Cricle(){

    }
    public Cricle (double radius){
        this.radius= radius;
    }

    public double getRadius(){
        return radius;
    }

//    public double getArea() {
//        return Math.PI * (this.radius * this.radius);
//    }

    void getArea() {
        System.out.println(Math.PI * (this.radius * this.radius));
    }
}
