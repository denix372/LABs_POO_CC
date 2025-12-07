package Curs5;

public class SirNumere {
    int vector[], dim, poz = 0;
    public SirNumere(int dim) {
        vector = new int[dim];
        this.dim = dim;
    }
    public void adauga(int x) throws ExceptieSirPlin {
        if(vector.length == dim) {
            throw new ExceptieSirPlin();
        } else {
            vector[this.poz++] = x;
        }
    }
    public int sterge(int x) throws Exception {
        if(this.poz == 0) {
            throw new ExceptieSirVid("Sirul este vid");
        } else {
            int pozitie = -1;
            for(int i = 0; i < this.poz && pozitie==-1; i++) {
                if(vector[i] == x) {
                    pozitie = i;
                }
            }
            if(pozitie != -1) {
                for(int i = pozitie; i < this.poz - 1; i++)
                    vector[i] = vector[i+1];
                return pozitie;
            } else {
                throw new Exception("Valoarea nu exista!");
            }
        }
    }
    public static void main(String args[]) {
        SirNumere sir = new SirNumere(10);
        /*try {
            for(int i = 0; i < 10; i++) {
                int nr = sir.sterge(sir.vector[i]);
            }
            while(true) {
                sir.adauga((int) Math.random() * 100);
            }
        } catch(ExceptieSirPlin e) {
            e.printStackTrace();
        } catch(ExceptieSirVid e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Am terminat");
        } */
    }
}
