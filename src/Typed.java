public class Typed {

    static void details(Object x){
        System.out.println(x);
        System.out.println(x.getClass());
        System.out.println(x.getClass().getName());
        System.out.println(x.getClass().getSimpleName());
        System.out.println(x.getClass().getSuperclass());
    }

    public static void main(String[] args) {
//        var x = 10;
        var x = "dog";
        System.out.println(x);
        System.out.println(((Object)x).getClass());
        System.out.println(((Object)x).getClass().getName());
        System.out.println(((Object)x).getClass().getSimpleName());
        System.out.println(((Object)x).getClass().getSuperclass());

        details(x);
    }
}
