package lec6;

// reverse a no like
public class ReverseNumber {
    public static void main(String[] args) {
int n=198765325;
int reverse_no=0;
int temp=n;

while(temp!=0){
    int rem=temp%10;
    reverse_no=reverse_no*10+rem;
    temp=temp/10;
}

        System.out.println(
                "original: "+n
        );
        System.out.println(
                "reversed: "+reverse_no
        );


    }
}
