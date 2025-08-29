/**
 *
 * @author Nan Mihai
 */


class SharPei extends Caine {
    private static final String taraProvenienta;

    {
        int varsta = 5;
        System.out.println("Bloc 3 - SharPei " + varsta);
    }

    static{
        System.out.println("Bloc 1 - SharPei");
        taraProvenienta = "China";
    }

    static{
        System.out.println("Bloc 2 - SharPei " + taraProvenienta);
    }
}


class Caine extends Animal {

    {
        System.out.println("Bloc 1 - Caine " + getCuloare());
    }

    {
        System.out.println("Bloc 4 - Caine");
    }

    {
        System.out.println("Bloc 3 - Caine");
    }

    static{
        System.out.println("Bloc 2 - Caine");
    }
}

class Animal {
    private static String culoare;

    {
        System.out.println("Bloc 1 - Animal");
        culoare = "negru";
    }

    public String getCuloare() {
        return culoare;
    }

    static{
        System.out.println("Bloc 2 - Animal");
    }

}

class Problema1 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        SharPei cutu = new SharPei();
    }
}