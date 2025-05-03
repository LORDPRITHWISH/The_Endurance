class reference {
    int a;
    int b;

    reference(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int multiply() {
        return a * b;
    }

    void grow() {
        a++;
        b++;
    }

    @Override
    public String toString() {
        return "reference{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

class tri extends reference{
    int c;
    tri(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    int multiply() {
        return a * b * c;
    }
    @Override
    public String toString() {
        return "tri{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

class reference2 {

    int x;
    int y;
    int z;
    reference2(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int add() {
        return x + y + z;
    }

    void grow() {
        x*=2;
        y*=3;
        z*=5;
    }

    @Override
    public String toString() {
        return "reference2{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

}

public class Classy {
    public static void main(String[] args) {
        reference obj = new reference(2, 3);
        System.out.println("Before grow: a = " + obj.a + ", b = " + obj.b);
        System.out.println("Multiply: " + obj.multiply());

        obj.grow();

        System.out.println("After grow: a = " + obj.a + ", b = " + obj.b);
        System.out.println("Multiply: " + obj.multiply());

        System.out.println(obj);



        tri obj2 = new tri(2, 3, 4);
        System.out.println("Before grow: " + obj2);
        System.out.println("Multiply: " + obj2.multiply());
        obj2.grow();
        System.out.println("After grow: " + obj2);
        System.out.println("Multiply: " + obj2.multiply());

    }
}
