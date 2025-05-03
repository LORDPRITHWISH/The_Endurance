import java.util.Scanner;

public class Exceptional {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in);){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Goodbye");
        }
    }
}
