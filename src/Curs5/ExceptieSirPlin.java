package Curs5;

public class ExceptieSirPlin extends Exception {
    public ExceptieSirPlin() {
        super("Sirul a atins capacitatea maxima!");
    }
}

class ExceptieSirVid extends Exception {
    public ExceptieSirVid(String text) {
        super(text);
    }
}