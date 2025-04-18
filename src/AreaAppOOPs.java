import java.util.*;

abstract class Shape{
    float area;
    abstract void input();
    abstract void compute();
    abstract void disp();
}

class Rectangle1 extends Shape{
    float length;
    float width;

    public void input(){
        System.out.println("Ractangle Area app");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        length=sc.nextFloat();
        System.out.println("Enter the width of rectangle:");
        width=sc.nextFloat();
    }

    public void compute(){
        area=length * width;
    }

    public void disp(){
        System.out.println("Area of rectangle:"+area);
    }
}

//Square area class
class Square1 extends Shape{
    float side;

    public void input(){
        System.out.println("Square Area app");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of square:");
        side=sc.nextFloat();
    }

    public void compute(){
        area=side * side;
    }

    public void disp(){
        System.out.println("Area of square:"+area);
    }
}

//circle class
class Circle1 extends Shape{
    float radius;

    public void input(){
        System.out.println("Circle Area app");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        radius=sc.nextFloat();
    }

    public void compute(){
        area= 3.14f * radius * radius;
    }

    public void disp(){
        System.out.println("Area of circle:"+area);
    }
}

class Geometry{
    void poly(Shape ref){
        ref.input();
        ref.compute();
        ref.disp();
    }

}



public class AreaAppOOPs {
    public static void main(String[] args) {
        Rectangle1 rec = new Rectangle1();
        Square1 s = new Square1();
        Circle1 c = new Circle1();
        Geometry g = new Geometry();
        g.poly(rec);
        g.poly(s);
        g.poly(c);

    }
}
