//import java.util.Scanner;
import java.util.Arrays;
public class Mul {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        int sizea=sc.nextInt();
        int[] a=new int[sizea];
        for(int i=0;i<sizea;i++){
            a[i]=sc.nextInt();
        }
        int sizeb=sc.nextInt();
        int[] b=new int[sizeb];
        for(int i=0;i<sizeb;i++){
            b[i]=sc.nextInt();
        }
        int min=Math.min(sizea,sizeb);
        for(int i=0;i<min;i++){
            System.out.print(a[i] * b[i]+" ");
        }
        for(int i=min;i<sizea;i++){
            System.out.print(a[i]+" ");
        }*/

            int a[]={1,2,3};
            int b[]={1,2,3,4,5};
            // ternary operator  (condition)?True:False
            int max=(a.length>b.length)?a.length:b.length;
            int c[]=new int[max];
            int min=(a.length<b.length)?a.length:b.length;

            for(int i=0;i<min;i++){
                c[i]=a[i]*b[i];
            }

            for(int i=min;i<max;i++){
                if(a.length >b.length){
                    c[i]=a[i];
                }
                else if(b.length>a.length){
                    c[i]=b[i];
                }
            }
            System.out.println(Arrays.toString(c));
        }
        
    }
    

