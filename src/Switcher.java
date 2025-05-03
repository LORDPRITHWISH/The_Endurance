public class Switcher {
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            default:
                System.out.println("x is neither 1 nor 2");
        }

        String day = "Monday";
        switch (day) {
            case "Monday" ->
                System.out.println("Start of the week");
            case "Friday"->
                System.out.println("End of the week");
            default->
                System.out.println("Midweek day");
        }

        String animal = "dog";
        animal="wolf";

        String sound = switch (animal) {
            case "cat" -> {
                System.out.println("I am a cat");
                yield "meow";
            }
            case "dog","wolf" -> {
                System.out.println("I am a dog");
                yield "bark";
            }
            case "cow" -> {
                System.out.println("I am a cow");
                yield "moo";
            }
            default -> {
                System.out.println("Unknown animal");
                yield "unknown sound";
            }
        };
        System.out.println("The sound of the " + animal + " is: " + sound);

        Object obj = "Hello";
        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case Double d -> "Double: " + d;
            default -> "Unknown type";
        };
        System.out.println("It is a fucking"+result);

        System.out.println(obj.getClass().getName());
        System.out.println(obj.getClass().getSimpleName());

    }
}
