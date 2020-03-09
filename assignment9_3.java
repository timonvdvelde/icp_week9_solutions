class Main {
  public static void main(String[] args) {
    Person person = new Person("Jan", "Klaassen");
    Person student = new Student("Klaas", "Pieter", "SFBS1");
    Person employee = new Employee("Henk", "Harolds", 100);
    Person teacher = new Teacher("Joep", "Hoepels", 101, "SFBS1");
    Person administrator = new Administrator("Clara", "Sarahs", 102, "C1.123");

    Person[] people = {person, student, employee, teacher, administrator};

    for (int i = 0; i < 5; i++) {
      System.out.println(people[i].getString());
    }

  }
}

class Person {
  private String firstName;
  private String lastName;

  Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  String getString() {
    return firstName + " " + lastName;
  }
}

class Student extends Person {
  private String className;

  Student(String first, String last, String className) {
    super(first, last);
    this.className = className;
  }

  String getString() {
    return super.getString() + ": Class: " + className;
  }
}

class Employee extends Person {
  private double salary;

  Employee(String first, String last, double salary) {
    super(first, last);
    this.salary = salary;
  }

  String getString() {
    return super.getString() + ": Salary: " + salary;
  }
}

class Teacher extends Employee {
  private String className;

  Teacher(String first, String last, double salary, String className) {
    super(first, last, salary);
    this.className = className;
  }

  String getString() {
    return super.getString() + ", Class: " + className;
  }
}

class Administrator extends Employee {
  private String office;

  Administrator(String first, String last, double salary, String office) {
    super(first, last, salary);
    this.office = office;
  }

  String getString() {
    return super.getString() + ", Office: " + office;
  }
}

