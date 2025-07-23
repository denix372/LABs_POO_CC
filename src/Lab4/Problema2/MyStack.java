package Lab4.Problema2;

//prin agregare
public class MyStack {
    private Array array = new Array();

    public void push(int x){
        array.addElement(x);
    }

    public void pop(){
        if(array.getSize() <= 0  )
            System.out.println("Nu se mai poate sterge din stiva");
        else{
            array.remove( array.getSize() - 1);
        }
    }

    @Override
    public String toString() {
        return array.toString();
    }
}
