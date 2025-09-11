package Lab6.Problema1;

public class Square extends Rectangle{
    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "Square with side: " + getLength()
                + "\n color:" + getColor() + "\n filled:"
                + isFilled();
    }

}
