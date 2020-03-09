class Main {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[8];

    shapes[0] = new Shape();
    shapes[1] = new Circle();
    shapes[2] = new Circle(2);
    shapes[3] = new Rectangle();
    shapes[4] = new Rectangle(2, 3);
    shapes[5] = new Shape("Pink");
    shapes[6] = new Circle("Grey", 3);
    shapes[7] = new Rectangle("Turquoise", 5, 3.3);
    
    for (int i = 0; i < shapes.length; i++) {
      System.out.println(shapes[i].getString());
    }
  }
}

class Shape {
  private String colour;

  Shape() {
    colour = "No colour";
  }

  Shape(String colour) {
    this.colour = colour;
  }

  String getColour() {
    return colour;
  }

  double getArea() {
    return 0;
  }

  double getCircumference() {
    return 0;
  }

  String getString() {
    return String.format("%s shape with area %.2f, circumference %.2f.",
        colour, getArea(), getCircumference());
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

  Circle(String colour, double radius) {
    super(colour);
    this.radius = radius;
  }

  double getArea() {
    return Math.PI * radius * radius;
  }

  double getCircumference() {
    return 2 * Math.PI * radius;
  }

  String getString() {
    return String.format("%s circle with radius %.2f, area %.2f, circumference %.2f", 
        getColour(), radius, getArea(), getCircumference());
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

  Rectangle(String colour, double length, double width) {
    super(colour);
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
    return String.format("%s rectangle with length %.2f and width %.2f, area %.2f, circumference %.2f.", 
        getColour(), length, width, getArea(), getCircumference());
  }

}

