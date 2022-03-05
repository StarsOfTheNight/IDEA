package ClassTest;

public class test2 extends test1{
    public String toString(){
        return getClass().getName();
    }
    public static void main(String[] args) {
        test1 t = new test1(1);
        System.out.println(new test2());
    }
}
