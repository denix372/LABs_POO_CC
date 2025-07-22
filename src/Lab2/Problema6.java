package Lab2;

import java.util.Vector;

public class Problema6 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(7.5);
        v.add("String");
        v.add(7.5);
        v.add(7);
        v.add(true);
        v.add('a');
        v.add(3.14f);

        Vector v_app = new Vector();
        v_app.setSize(6);
        for(int i=0; i < 6; i++) {
            v_app.setElementAt(0,i);
        }

        for(int i=0; i < v.toArray().length; i++) {
            if( v.get(i).getClass().equals( Integer.class) ){
                int old = (int) v_app.get(0);
                v_app.setElementAt(old + 1,0);
            }
            else if( v.get(i).getClass().equals( Double.class) ){
                int old = (int) v_app.get(1);
                v_app.setElementAt(old + 1,1);
            }
            else if( v.get(i).getClass().equals( Float.class) ){
                int old = (int) v_app.get(2);
                v_app.setElementAt(old + 1,2);
            }
            else if( v.get(i).getClass().equals( String.class) ){
                int old = (int) v_app.get(3);
                v_app.setElementAt(old + 1,3);
            }
            else if( v.get(i).getClass().equals( Character.class) ){
                int old = (int) v_app.get(4);
                v_app.setElementAt(old + 1,4);
            }
            else if( v.get(i).getClass().equals( Boolean.class) ){
                int old = (int) v_app.get(5);
                v_app.setElementAt(old + 1,5);
            }
        }

        for(int i=0; i < 6; i++) {
            if( i == 0) {
                System.out.println("Ints: " + v_app.get(i));
            }
            else if(i==1) {
                System.out.println("Doubles: " + v_app.get(i));
            }
            else if(i==2) {
                System.out.println("Floats: " + v_app.get(i));
            }
            else if(i==3) {
                System.out.println("Strings: " + v_app.get(i));
            }
            else if(i==4) {
                System.out.println("Chars: " + v_app.get(i));
            }
            else if(i==5) {
                System.out.println("Booleans: " + v_app.get(i));
            }
        }
    }
}
