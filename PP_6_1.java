package PP_6_1;
import java.util.Scanner;

public class PP_6_1{
    //hi
    
    public static void main (String args[]){
        int[] n = new int[51];
        boolean d = true;
        int a;
        Scanner haha=new Scanner(System.in);
        for(int s = 0;s<=50;s++){
            n[s]=0;
        }
        do{
            System.out.println("put in your number, input -1 to quit");
            a = haha.nextInt();
            if(a==-1){
                d=false;
            }else if(a>50||a<0){
                System.out.println("out of range");
            }else{
                n[a]++;
                
            }
        }while(d);
        for(int s=0;s<=50;s++){
            System.out.println(s+":\t"+n[s]);
        }
    }
    
    
}
