package Lab1;

public class Problema7 {
    boolean prim(int nr) {
        if( nr < 1)
            return false;
        if( nr%2==0 && nr!=2)
            return false;
        for(int i = 3 ; i * i <=nr; i +=2){
            if(nr%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Problema7 p = new Problema7();
        int n = 10;
        for(int a = 0; a<=n; a++)
            for(int b = 0; b <=n && b <= a/2; b++){
                int c = a - b;
                if( a == c + b && p.prim(b)==true && p.prim(c)==true)
                    System.out.println(a + " = " + b + " + " + c);
            }
    }
}