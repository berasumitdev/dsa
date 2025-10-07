package lec6;

// count occurrences in a given no for a specific no eg: 12345333 here 3 is 4 times
public class CountingOccurrences {

    public static void main(String[] args) {
        int n=434367133;
        int check=3;
        int count=0;
        while(n!=0){
            int rem=n%10;
            if(rem==check){
                count ++;
            }
            n=n/10;
        }

        System.out.println(check+" is "+count+" times");
    }
}
