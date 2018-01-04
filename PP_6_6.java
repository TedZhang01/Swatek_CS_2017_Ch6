package PP_6_6;

import java.util.Scanner;

public class PP_6_6
{
    // instance variables - replace the example below with your own
    public static void main(String[]args)
    {
        double n1=0,n2=0,n3=0;
        int a=0,b=0,c=0;
        int[] ddd = new int [3];
        char j;
        boolean s=true;
        Scanner haha = new Scanner(System.in);
        Bank ICBC = new Bank();
        ICBC.NewAccount("Ted",1,100000);
        ICBC.withdraw(1,10,1);
        ICBC.NewAccount("Teddy",1,19);
        System.out.println(ICBC.toString(1));

    }
}