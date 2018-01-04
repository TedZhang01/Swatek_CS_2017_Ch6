package PP_6_3;

import java.util.Scanner;

public class PP_6_3
{
    // instance variables - replace the example below with your own
    public static void main(String[]args)
    {
        double n1=0,n2=0,n3=0;
        int a=0,b=0,c=0;
        int[] ddd = {1,3,5,2,6,-4,-3,4,6,7};
        char j;
        boolean s=true;
        Scanner haha = new Scanner(System.in);
        //int d[]=Sorts.SelectionSorts(ddd);
        int d[]=Sorts.InsertionSorts(ddd);
        for(c = 1;c<=ddd.length;c++){
            System.out.println(ddd[c-1]);
        }

    }
}