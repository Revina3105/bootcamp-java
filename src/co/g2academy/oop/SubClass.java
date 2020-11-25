package co.g2academy.oop;

public class SubClass extends SuperClass{
    int num = 10;
    public void display(){
        System.out.println("This is the display method of subclass");
    }
    public void myMethod(){
        this.display();
        super.display();
        System.out.println("Value of the variable named num is subclass:" + this.num);
        System.out.println("Value of the variable named num is superclass:" + super.num);
    }

    public static void main(String[] args) {
        new SubClass().myMethod();
    }
}

