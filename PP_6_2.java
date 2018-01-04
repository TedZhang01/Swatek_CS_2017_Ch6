package PP_6_2;
import java.util.Scanner;

public class PP_6_2{
    
    public static void main (String args[]){
        int[] n = new int[51];
        boolean d = true;
        int a;
        Scanner haha=new Scanner(System.in);
        for(int s = 0;s<=50;s++){
            n[s]=0;
        }
        do{
            System.out.println("put in your number, input 100 to quit");
            a = haha.nextInt();
            if(a==100){
                d=false;
            }else if(a>25||a<-25){
                System.out.println("out of range");
            }else{
                n[a+25]++;
                
            }
        }while(d);
        for(int s=-25;s<=25;s++){
            System.out.println(s+":\t"+n[s+25]);
        }
    }
    
    
}