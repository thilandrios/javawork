package src;

import java.sql.Time;

public class test2 {
    public static int foo(int a, String s) {

        s = "Yellow";
        a=a+2;
        return a;
        
         }
        
         public static void bar() {
        
        int a=3;
        String s = "Blue";
        a = foo(a,s);
        System.out.println("a="+a+" s="+s);
        
         }
        
         public static void main(String[] args)  {
        
        bar();
        Time time = new Time(11, 59, 59.9);
        System.out.println(time);
        
         }
}
