class Example {
    void action(){
        System.out.println("I am an action method");
    }
}

public class AnoClass {
    public static void main(String[] args) {
        Example example = new Example();
        Example exampleOver = new Example() {
            @Override
            void action() {
                System.out.println("I am an overridden action method");
            }
        };
        example.action();
        exampleOver.action();
    }
}
