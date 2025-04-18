import java.util.*;

//Rectangle App class
class Rectangle{
    float length;
    float width;
    float area;

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
class Square{
    float side;
    float area;

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
class Circle{
    float radius;
    float area;

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

public class AreaApp {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.input();
        rec.compute();
        rec.disp();

        Square s = new Square();
        s.input();
        s.compute();
        s.disp();

        Circle c = new Circle();
        c.input();
        c.compute();
        c.disp();
    }
}
