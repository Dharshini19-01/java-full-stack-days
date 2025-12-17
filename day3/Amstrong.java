//write a program to check whether the given number is a amstrong or not:

public class Amstrong {
    public static void main(String[] args) {
        int n=122;
        int dup=n;
        int sum=0;
        while(dup!=0){
            int rem=dup%10;
            sum=sum+(int)Math.pow(rem,3);
            dup=dup/10;
        }
        if(n==sum){
            System.out.println("armstrong");
        }

        
    }
    
}
