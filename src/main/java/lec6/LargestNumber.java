package lec6;

import java.util.Scanner;
// largest no among 3 no
public class LargestNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

//        int l=a;
//        if(b>l){
//            l=b;
//        }
//        if(c>l){
//            l=c;
//        }

//        using Math.max function
        int l=Math.max(a,Math.max(b,c));

        System.out.println("max:"+l);
    }
}
