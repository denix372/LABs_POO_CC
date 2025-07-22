package Lab3.Problema1;

public class Fractie {
    int numarator, numitor;

    public Fractie (int a, int b) {
        this.numarator = a;
        this.numitor = b;
    }

    public Fractie() {
        this(0, 1);
    }


    public void suma(Fractie f1) {
        if( this.numitor == f1.numitor) {
            this.numarator += f1.numarator;
        }
        else {
            this.numarator =  this.numarator * f1.numitor + this.numitor * f1.numarator;
            this.numitor *= f1.numitor;
        }
    }

    @Override
    public String toString() {
        return this.numarator + "/" + this.numitor;
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj)
            return true;
        else if (obj == null || getClass() != obj.getClass())
            return false;
        else {
            Fractie f1 = (Fractie) obj;
            if( this.numarator == f1.numarator && this.numitor == f1.numitor)
                return true;
            else return false;
        }
    }

}

