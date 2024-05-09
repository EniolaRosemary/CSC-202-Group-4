
import java.util.Scanner;

abstract class Shape {
     abstract double calculateArea();
     abstract double calculateVolume();
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double calculateVolume() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateVolume() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculateVolume() {
        return 0.0;
    }
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return 6 * side * side;
    }

    public double calculateVolume() {
        return side * side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select a shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.println("4. Sphere");
        System.out.println("5. Cube");

        int choice = scanner.nextInt();
        double dim1, dim2;
        switch (choice) {
            case 1:
                System.out.print("Enter the base of the triangle: ");
                dim1 = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                dim2 = scanner.nextDouble();
                Triangle triangle = new Triangle(dim1, dim2);
                System.out.println("Area of the triangle: " + triangle.calculateArea());
                break;
            case 2:
                System.out.print("Enter the radius of the circle: ");
                dim1 = scanner.nextDouble();
                Circle circle = new Circle(dim1);
                System.out.println("Area of the circle: " + circle.calculateArea());
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                dim1 = scanner.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                dim2 = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(dim1, dim2);
                System.out.println("Area of the rectangle: " + rectangle.calculateArea());
                break;
            case 4:
                System.out.print("Enter the radius of the sphere: ");
                dim1 = scanner.nextDouble();
                Sphere sphere = new Sphere(dim1);
                System.out.println("Surface area of the sphere: " + sphere.calculateArea());
                System.out.println("Volume of the sphere: " + sphere.calculateVolume());
                break;
            case 5:
                System.out.print("Enter the side length of the cube: ");
                dim1 = scanner.nextDouble();
                Cube cube = new Cube(dim1);
                System.out.println("Surface area of the cube: " + cube.calculateArea());
                System.out.println("Volume of the cube: " + cube.calculateVolume());
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
