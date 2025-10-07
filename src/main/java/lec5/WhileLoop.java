package lec5;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter a no:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Output:");
        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}
