package Curs5;

public class DemoChild extends Demo {
    int value3;
    int value4;
    DemoChild() {
        super(5);
        value3 = 3;
        value4 = 4;
        System.out.println("Inside Child Constructor");
    }
    public void display() {
        System.out.println("Value1 === "+value1);
        System.out.println("Value2 === "+value2);
        //sau: super.display();
        System.out.println("Value3 === "+value3);
        System.out.println("Value4 === "+value4);
    }
    public static void main(String args[]) {
        DemoChild d1 = new DemoChild();
        d1.display();
    }
}
