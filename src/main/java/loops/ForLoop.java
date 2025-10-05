package loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Enter a no:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Output:");
        for (int i=0;i<n;i++){
            System.out.print((i+1)+" ");
        }
    }
}
