package lec6;

import java.util.Scanner;
// type check of an alphabet
public class AlphabetTypecheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//            trim extra space and take only first char
        char ch=s.next().trim().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println(
                    ch+ " is lowercase"
            );
        }else if(ch>='A' && ch<='Z'){
            System.out.println(
                    ch+ " is uppercase"
            );
        }else{
            System.out.println(ch+" not a alphabet");
        }

    }
}
