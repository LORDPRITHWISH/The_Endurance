public class Trial {
    public static void main(String[] args) {
        int a = 5;
        final int c = 4;
        System.out.println("a = " + a + " c = " + c);
        a++;
//        c++; it's final
        System.out.println("a = " + a + " c = " + c);
    }
}
