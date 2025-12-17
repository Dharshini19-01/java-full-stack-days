public class Q {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(i==0||j==0||i==4||j==4||i==2 && j==2|| i==3 && j==3|| i==5 && j==5){
                    System.out.println("*");
                }
                else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
