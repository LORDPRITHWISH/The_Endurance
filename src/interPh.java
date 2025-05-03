interface planA {
    int a = 5;
    action multA();

    default void reveal() {
        System.out.println("revealed planA" + " " + a);
    }
}

interface planB {
    int b= 10;
    action multB();

    default void reveal() {
        System.out.println("revealed planB" + " " + b);
    }
}

interface planC {
    int c = 15;
    action multC();

    default void reveal() {
        System.out.println("revealed planC" + " " + c);
    }
}

interface planD {
    int d = 20;
    action multD();

    default void reveal() {
        System.out.println("revealed planD" + " " + d);
    }

}

class action implements planA, planB, planC, planD {

    int x = 0;

    action(int x) {
        this.x = x;
    }

    @Override
    public action multA() {
        x *= a;
        return this ;
    }

    @Override
    public action multB() {
        x *= b;
        return this ;
    }

    @Override
    public action multC() {
        x *= c;
        return this ;
    }

    @Override
    public action multD() {
        x *= d;
        return this ;
    }

    @Override
    public String toString() {
        return String.valueOf(x);
    }

    @Override
    public void reveal() {
        System.out.println("revealed");
        planA.super.reveal();
        planB.super.reveal();
        planC.super.reveal();
        planD.super.reveal();
    }
}

public class interPh {
    public static void main(String[] args) {
        action obj = new action(10);
        System.out.println("mult: " + obj.multA().multB().multC().multD());
        obj.reveal();
    }
}
