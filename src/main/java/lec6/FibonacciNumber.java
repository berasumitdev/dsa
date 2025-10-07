package lec6;

import java.util.Scanner;

// find n'th fibonacci series
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter nth no:");
        int n=s.nextInt();

        int a=0;
        int b=1;
        int count =2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }

        System.out.println(n+" th no of fibonacci series is: "+b);
    }
}
