// two pointerapproach
import java.util.Scanner;
import java.util.Arrays;

public class Rrotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
            int index=0;
            for(int j =0;j <len;j++){
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[index];
                arr[index]=temp;
                index++;
            }
            
        }
        System.out.println(Arrays.toString(arr));

    }

}
