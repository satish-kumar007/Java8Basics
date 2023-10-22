package scaler.practice;

import java.util.Scanner;
class Circle {
    private final float PI=3.14F;
    private float radius;

    // Define constructor here
    public Circle(float radius) {
        this.radius = radius;
    }
    float perimeter(){
        return 2*PI*radius;
    }
    float area(){
        // Complete the function
        return PI*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            float radius = sc.nextFloat();
            Circle c = new Circle(radius);
            System.out.println(c.perimeter());
            System.out.println(c.area());
        }
    }
}

/*
    Circle a = new Circle(3)  // Radius = 3
	a.perimeter() // 18.84
    a.area() // 28.26
*/