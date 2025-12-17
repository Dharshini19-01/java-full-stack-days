public class Pattern {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(j==0||i==3|| i==1 && j==1||i==2 && j==1||i==2 && j==2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
