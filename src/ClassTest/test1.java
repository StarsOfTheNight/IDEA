package ClassTest;

public class test1 extends test{
    private int a;
    test1(){
        System.out.println("test1无参构造函数");
    }
    public  void show(test1 t2){
        System.out.println(t2.a);
    }
    test1(int a){
        super(1);
        this.a=a;
        super.show();
        super.show1();
        System.out.println("test1有参构造函数");
    }
}
