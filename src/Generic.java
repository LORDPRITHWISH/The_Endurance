class universal<T> {
    T value;

    public universal(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Generic {
    public static void main(String[] args) {
        universal<String> str = new universal<>("Hello");
        System.out.println(str.getValue());

        universal<Integer> num = new universal<>(123);
        System.out.println(num.getValue());

        universal<Double> dec = new universal<>(123.45);
        System.out.println(dec.getValue());
    }
}
