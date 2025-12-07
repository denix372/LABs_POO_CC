package Lab4.Problema2;

public class SortedArray extends Array {
    public SortedArray() {
        super();
    }

    @Override
    public void addElement(Integer x) {
        super.addElement(x);
        super.sort();
    }

    // nu are sens pentru un vector sortat, dar o supradefinim sa ifm sigur ca nu incurca
    @Override
    public void addElement(Integer x, int poz) {
        super.addElement(x);
        super.sort();
    }
}
