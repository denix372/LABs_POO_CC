package Lab4.Problema2;

public class Test {
    public static void main(String[] args) {
        SortedArray arr = new SortedArray();
        MyStack stack = new MyStack();

        arr.addElement(3);
        arr.addElement(1);
        arr.addElement(2);

        System.out.println("SortedArray: " + arr);

        stack.push(4);
        stack.push(8);
        stack.push(3);
        stack.push(5);
        System.out.println("Stiva: " + stack);
        System.out.println("Am eliminat: " + stack.pop());
        System.out.println("Stiva: " + stack);
        stack.pop();
        stack.pop();
        System.out.println("Stiva: " + stack);

    }
}
