package Lab3.Problema7;

public class Route {
    private String origin, destination;

    public Route(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public boolean retur(Route route) {
        return origin.equals(getDestination()) && route.getOrigin().equals(destination);
    }

}
