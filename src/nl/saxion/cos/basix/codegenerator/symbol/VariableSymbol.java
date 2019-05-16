package nl.saxion.cos.basix.codegenerator.symbol;

/* TODO: This class needs some refactoring
 *   - Storing types and values is done quite poorly...
 *   - Developer can enter any variable type, need some way to make it less error prone!
 */

/**
 * @author jarnowitjes on 2019-05-13
 */
public class VariableSymbol extends Symbol {

    private String type;
    private String value;

    public VariableSymbol(int index, String name, String type, String value) {
        super(index, name);

        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
