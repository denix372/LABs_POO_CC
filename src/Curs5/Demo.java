package Curs5;

public class Demo {
    int value1;
    int value2;
    Demo() {
        value1 = 1;
        value2 = 2;
        System.out.println("Inside 1st Parent Constructor");
    }
    Demo ( int a ) {
        value1 = a;
        System.out.println("Inside 2nd Parent Constructor");
    }
    public void display() {
        System.out.println("Value1 === "+value1);
        System.out.println("Value2 === "+value2);
    }
}

