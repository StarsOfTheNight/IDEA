package test;

public class Jieceng {
    public static void main(String[] args) {
        int i=1;
        double s=0;
        double t=1;
        while (i<=20)
        {
            t=t*1/i;
            i++;
            s=s+t;
        }
        System.out.println(s);
    }
}
