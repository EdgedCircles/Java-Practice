interface Shape {
     double getArea(); 
} 

class Rectangle implements Shape { 
    private double width; 
    private double height; 
    public Rectangle(double width, double height) { 
        this.width = width; this.height = height; 
    } 
    public double getArea() { 
        return width * height; 
    } 
} 

class Circle implements Shape { 
    private double radius; 
    public Circle(double radius) { 
        this.radius = radius; 
    } 
    public double getArea() { 
        return Math.PI * radius * radius; 
    } 
} 

class AreaCalculator { 
    public double sumAreas(Shape[] shapes) { 
        double totalArea = 0; 
        for (Shape shape : shapes) { 
            totalArea += shape.getArea(); 
        } 
        return totalArea; 
    } 
} 

public class Polyp {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,12);
        Rectangle r2 = new Rectangle(15,9);
        Rectangle r3 = new Rectangle(5,30);
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(50);
        Shape [] shapes = {r1,r2,r3,c1,c2};
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.sumAreas(shapes);
        System.out.println("Total Area: " + totalArea);
        
    }
}
