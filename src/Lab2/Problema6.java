package Lab2;
import java.util.Vector;
public class Problema6 {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector<Integer> app = new Vector<>();
        v.add(7.5); //default double
        v.add("String");
        v.add((float)7.5);
        v.add('c');
        v.add("c"); //string
        v.add(true);
        v.add(5);
        v.add((double)5);

        for (int i = 0; i < 6; i++)
            app.add(0);

        for (Object obj : v)
            if (obj.getClass().equals(Integer.class))
                app.set(0, app.get(0) + 1);
            else if (obj.getClass().equals(Character.class))
                app.set(1, app.get(1) + 1);
            else if (obj.getClass().equals(String.class))
                app.set(2, app.get(2) + 1);
            else if (obj.getClass().equals(Double.class))
                app.set(3, app.get(3) + 1);
            else if (obj.getClass().equals(Float.class))
                app.set(4, app.get(4) + 1);
            else if (obj.getClass().equals(Boolean.class))
                app.set(5, app.get(5) + 1);

        System.out.println("Integers: " + app.get(0));
        System.out.println("Chars: " + app.get(1));
        System.out.println("Strings: " + app.get(2));
        System.out.println("Doubles: " + app.get(3));
        System.out.println("Float: " + app.get(4));
        System.out.println("Bools: " + app.get(5));
    }
}
