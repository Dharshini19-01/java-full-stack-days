public class Loop {
    public static void main(String[] args) {
        //if statement program:

        // if - else statement program:
        // to find a given nos are odd or even:
        int n=42;
        if(n%2==0){
            System.out.println(n+"is even");
        }
        else{
            System.out.println(n+"is");
        }

        //else-if statement program:
        //to find a given no is a positive,negative or zero
        int a=-20;
        if(a>0){
            System.out.println(n+" is a positive");
        }    
        else if(a<0){
            System.out.println(n+" is a negative");
                }
        else{
            System.out.println(n+" is a zero");
        }  
       
        // switch statement program:
        // display day.
        int day=5;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;                        
        }
    }
    
}
