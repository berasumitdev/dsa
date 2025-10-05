import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println("Enter temp in celsius:");
        Scanner s=new Scanner(System.in);
        float cel=s.nextFloat();

        float f =(cel*9/5)+32;
        System.out.println("fahrenheit: "+f);

    }
}
