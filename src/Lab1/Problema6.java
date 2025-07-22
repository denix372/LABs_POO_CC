package Lab1;

public class Problema6 {
    boolean Prim(int nr) {
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
        Problema6 p = new Problema6();
        for(int i = 0; i<=20; i++)
            System.out.println(p.Prim(i));
    }
}
