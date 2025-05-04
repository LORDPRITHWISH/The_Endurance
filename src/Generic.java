class universal<T> {
    T value;

    public universal(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class Duality<T, U> {
    T first;
    U second;

    public Duality(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public String combine() {
        return String.valueOf(first) + String.valueOf(second);
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

        System.out.println("-----------------");

        Duality<String, Integer> dual = new Duality<>("Hello", 123);
        System.out.println(dual.getFirst());
        System.out.println(dual.getSecond());
        System.out.println(dual.combine());

    }
}
