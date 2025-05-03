class parent{
int a;
private int b;
protected int c;

    parent(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void show(){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    void setB(int b){
        this.b = b;
    }
    int getB(){
        return b;
    }

}

class child extends parent{
    int d;
    private int e;
    protected int f;

    child(int a, int b, int c, int d, int e, int f){
        super(a, b, c);
        this.d = d;
        this.e = e;
        this.f = f;
    }

    void show(){
        System.out.println("a: " + a);
//        System.out.println("b: " + b); private sorry
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
    }
}

public class GetSetGo {
    public static void main(String[] args) {
        parent obj1 = new parent(1, 2, 3);
        obj1.show();
        obj1.setB((10 + obj1.getB())/2);
        System.out.println("After setting b: ");
        obj1.show();
        System.out.println("-----------------");
        child obj2 = new child(4, 5, 6, 7, 8, 9);
        obj2.show();
    }
}
