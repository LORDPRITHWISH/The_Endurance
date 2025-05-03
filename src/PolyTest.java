interface polyPrime{
    void message();
}

class polyChild1 implements polyPrime{
    public void message(){
        System.out.println("Hello from child class uno aka polyChild A");
    }

    void ability(){
        System.out.println("I can fly");
    }
}

class polyChild2 implements polyPrime{
    public void message(){
        System.out.println("Hello from child class dos aka polyChild B");
    }

    void ability(){
        System.out.println("I can swim");
    }
}

class polyChild3 implements polyPrime{
    public void message(){
        System.out.println("Hello from child class tres aka polyChild C");
    }

    void ability(){
        System.out.println("I can run");
    }
}

public class PolyTest {

    public static void main(String[] args) {

        polyPrime[] children = {
            new polyChild1(),
            new polyChild2(),
            new polyChild3()
        };

        for (polyPrime child : children) {
            child.message();
//            child.ability();
            switch (child.getClass().getSimpleName()){
                case "polyChild1":
                    ((polyChild1)child).ability();
                    break;
                case "polyChild2":
                    ((polyChild2)child).ability();
                    break;
                case "polyChild3":
                    ((polyChild3)child).ability();
                    break;
            }
        }

    }

}
