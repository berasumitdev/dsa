package lec6;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("Enter sal:");
        Scanner s =new Scanner(System.in);
        int sal=s.nextInt();

        if(sal>=20000){
            sal=sal+200;
        }else if(sal>=30000){
            sal=sal+300;
        }else{
            sal=sal+10;
        }

        System.out.println("bonus+sal:"+sal);
    }
}
