class Main {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[5];

    shapes[0] = new Shape();
    shapes[1] = new Circle();
    shapes[2] = new Circle(2);
    shapes[3] = new Rectangle();
    shapes[4] = new Rectangle(2, 3);
    
    for (int i = 0; i < shapes.length; i++) {
      System.out.println(shapes[i].getString());
    }
  }
}

class Shape {
  Shape() {
  }

  double getArea() {
    return 0;
  }

  double getCircumference() {
    return 0;
  }

  String getString() {
    return String.format("Shape with area %.2f, circumference %.2f.",
        getArea(), getCircumference());
  }
}

class Circle extends Shape {
  private double radius;

  Circle() {
    radius = 1;
  }

  Circle(double radius) {
    this.radius = radius;
  }

  double getArea() {
    return Math.PI * radius * radius;
  }

  double getCircumference() {
    return 2 * Math.PI * radius;
  }

  String getString() {
    return String.format("Circle with radius %.2f, area %.2f, circumference %.2f", 
        radius, getArea(), getCircumference());
  }

}

class Rectangle extends Shape {
  private double length;
  private double width;
  
  Rectangle() {
    length = 1;
    width = 1;
  }

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double getArea() {
    return length * width;
  }

  double getCircumference() {
    return 2 * length + 2 * width;
  }

  String getString() {
    return String.format("Rectangle with length %.2f and width %.2f, area %.2f, circumference %.2f.", 
        length, width, getArea(), getCircumference());
  }

}

