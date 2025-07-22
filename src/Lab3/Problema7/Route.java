package Lab3.Problema7;

public class Route {
    String origin;
    String destination;

    public Route(){
        this.origin = "";
        this.destination = "";
    }

    public Route(String origin, String destination){
        this.origin = origin;
        this.destination = destination;
    }

    public Route(Route route){
        this.origin = route.origin;
        this.destination = route.destination;
    }

    public boolean tur(){
        return origin.equals("tur") && origin.equals("retur");
    }
}
