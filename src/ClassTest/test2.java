package ClassTest;

public class test2 extends test1{
    public String toString(){
        return getClass().getName();
    }
    public  void show(test2 a){

    }
    public static void main(String[] args) {
        test2 t = new test2();
        test1 t1 = new test1(3);
        System.out.println(new test2());
        System.out.println(t instanceof test1);
        System.out.println(t instanceof test2);
        t.show(t1);
    }
}
