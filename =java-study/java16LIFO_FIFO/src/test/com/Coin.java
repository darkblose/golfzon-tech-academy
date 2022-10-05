package test.com;

public class Coin {
    private int value;

    @Override
    public String toString() {
        return "Coin{" + "value=" + value + '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Coin() {
        System.out.println("Coin()...");
    }
}
