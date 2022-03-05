package test;
public class String_case {
    public static void main(String[] args) {
        String str = "aBcD";
        String str1 = "dfafjahgjgaj";
        String str2 = " kwuiewoeuiqweoq";
        System.out.println("大写："+str.toUpperCase()+"   "+"小写"+str.toLowerCase());
        if(str1.substring(1,6) == str2.substring(1,6))
            System.out.println("两个字串相等");
        else
            System.out.println("两个字串不等");
    }
}
