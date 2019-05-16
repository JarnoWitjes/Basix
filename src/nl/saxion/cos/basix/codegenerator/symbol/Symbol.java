package nl.saxion.cos.basix.codegenerator.symbol;

/**
 * @author jarnowitjes on 2019-05-13
 */
public class Symbol {

    private String name;
    private int index;

    Symbol(int index, String name) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
