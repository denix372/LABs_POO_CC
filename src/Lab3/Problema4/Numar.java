package Lab3.Problema4;

public class Numar {
    int nr;

    public Numar(){
        nr = 0;
    }

    //returneaza suma dintre nr (membrul clasei) si a
    public int suma(int a) {
        return this.nr + a;
    }

    //returneaza suma dintre nr, a si b
    public int suma(int a, int b){
        return  this.suma(a) + b;
    }

    //returneaza suma dintre nr, a, b si c
    public int suma(int a, int b, int c){
        return this.suma(a,b) + c;
    }

    //returneaza suma dintre nr, a, b, c si d
    public int suma(int a, int b, int c, int d){
        return this.suma(a,b,c) + d;
    }

    //Se evidentiaza principium supraincarcarii metodelor

}
