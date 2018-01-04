package PP_6_4;

import java.util.Scanner;

public class PP_6_4
{
    // instance variables - replace the example below with your own
    public static void main(String[]args)
    {
        double n1=0,n2=0,n3=0;
        int a=0,b=0,c=0;
        int[] n = new int [100];
        char j;
        boolean s=true;
        Scanner haha = new Scanner(System.in);
        do{
           System.out.println("put in your number,press 0 to finish input");
           a = haha.nextInt();
           if(a>0&&a<=100){
               n[a-1]++;
           }else if(a==0){
              s=false; 
           }else{
               System.out.println("out of range");
           }
        }while(s);
        for(int f = 0;f<10;f++){
            for(int g = 0;g<10;g++){
                b+=n[f*10+g];
            }
            System.out.print(""+(f*10+1)+"-"+((f+1)*10)+"\t | ");
            for(c=0;c<b;c++){
                System.out.print("*");
            }
            System.out.println();
            b=0;
        }
        

    }
}