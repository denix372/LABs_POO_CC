package Lab4.Problema2;

public class Main {
    public static void main(String[] args) {
        Array arr = new Array();
        arr.addElement(5);
        arr.addElement(3);
        arr.addElement(1);
        arr.addElement(2);
        arr.addElement(4);

        System.out.println(arr);

        SortedArray sarr = new SortedArray();
        sarr.addElement(5);
        sarr.addElement(3);
        sarr.addElement(1);
        sarr.addElement(2);
        sarr.addElement(4);

        System.out.println(sarr);

        MyStack st = new MyStack();
        st.push(5);
        st.push(3);
        st.pop();
        st.push(2);
        st.pop();

        System.out.println(st);
        st.pop();
        st.pop();

    }
}
