package PP_6_3;

public class Sorts{    //ez wrote by Ted 
    private static int[] l = new int[100000];//max of 1000000 index
    public static int[] SelectionSorts(int[] in){
        l = in;
        int a = in.length;
        int b;
        for(int s=0;s<a;s++){
            for(int ss = s+1;ss<(a);ss++){
                if(l[s]<l[ss]){
                    b=in[s];
                    l[s]=l[ss];
                    l[ss]=b;
                }
            }
        }
        return l;
    }
    public static int[] InsertionSorts(int[] in){
        l = in;
        int a = in.length;
        int b;
        for(int s=1;s<a;s++){
            for (int ss =0;ss<s;ss++){
                if(l[s]>l[ss]){
                    b=l[s];
                    for(int sss = s; sss>ss;sss--){
                        l[sss]=l[sss-1];
                    }
                    l[ss]=b;
                    break;
                }
                
            }
            
        }
        return l;
    }
    
    
    
}