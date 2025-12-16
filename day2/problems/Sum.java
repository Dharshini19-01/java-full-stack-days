package day2.problems;

public class Sum {
    public static void main(String[] args) {
        int n=134;
        int add=0;
        while(n!=0){
            int rem=n%10;
            add=add+rem;
            n=n/10;
        }
        System.out.println(add);
    }
}
