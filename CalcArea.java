import java.util.Scanner;


public class CalcArea {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

    public static void main(String[] args) {
        CalcArea a=new CalcArea();
        a.setRadius(9);
        a.setHeight(12);
        System.out.println(a.surfaceArea());
        System.out.println(a.volume());
        }
        }


