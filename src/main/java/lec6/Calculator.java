package lec6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int result=0;
            System.out.println("Calculator: + - * /");
            System.out.println("Quit: X");
            System.out.println("--------------------");
            System.out.println("Enter no1:");
            int a=s.nextInt();
            System.out.println("Enter no2:");
            int b=s.nextInt();
            System.out.println("Choose Operation:");
            char ch=s.next().trim().charAt(0);
            if(ch == '+'){
                result=a+b;
            }else if(ch == '-'){
                result=a-b;
            } else if(ch == '*'){
                result=a*b;
            } else if(ch == '/'){
                result=a/b;
            } else if(ch == 'x' || ch == 'X'){
                break;
            } else{
                System.out.println("NOT A VALID OPERATOR! TRY AGAIN");
            }

            System.out.println("Result: " + result);
        }

        s.close();
    }
}
