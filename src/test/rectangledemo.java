package test;

public class rectangledemo {
    public static void main(String[] args) {
        rectangle rec = new rectangle(3,4);
        int area=rec.getArea();
        System.out.println("面积："+area);
        rec.setLongth(5);
        rec.setWidth(6);
        int area1=rec.getArea();
        System.out.println("面积："+area1);
    }
}
