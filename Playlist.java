package PP_class_1;

import java.util.ArrayList;
import java.util.ListIterator;


public class Playlist
{
    // instance variables - replace the example below with your own
    private ArrayList<Song> List = new ArrayList<Song>();
    private ArrayList<Song> Random = new ArrayList<Song>();
    private int ccc=0,rrr=0,fff=0;
    private Song current;
    private int ddd=0;
    private int[] a,h,j;
    private int state = 0;
    public Playlist(){
        a = new int[List.size()];
    }
    public void addSong(Song add){
        List.add(add);
        a = new int[List.size()];
        //System.out.println(List.size());
        if(ddd==0){
            current = add;
            ddd=1;
        }
    }
    public Song removeSong(Song remove){
        for(int x=0;x<List.size();x++){
            if(List.get(x)==remove){
                List.remove(x);
            }
        }
        return remove;
    }
    public Song getRandomNext(){
        if(state!=2){
            ccc=0;
            a = new int[List.size()];
        }
        state=2;
        //a = new int[List.size()];
        Song r;
        
        //ccc=0;
        if(ccc==0){
        //int[] a = new int[List.size()];
        for(int x =0; x<a.length;x++){
            a[x]=1;
            //System.out.println(a[x]);
        }
        
        
        ccc=1;
    }
    //System.out.println(a[2]);
    //System.out.println(a);
    //current = List.get(2);
    if(Math.random()>0.15){
        //System.out.println(""+a[0]+a[1]+a[2]);
        boolean t = true;
        int erer=0;
        while(t){
            int f = (int)(Math.random()*a.length);
            
            //System.out.println(""+f+""+a[f]);
            if (a[f]!=0){
                t=false;
                a[f]=0;
                current = List.get(f);
                return List.get(f);
            }
            erer++;
            if(erer>=a.length){
                for(int x =0; x<a.length;x++){
                    a[x]=1;
                    //System.out.println(a[x]);
             }
            }
            //System.out.println("1");
        }
        
    }else{
        boolean t =true;
        int eee = 0;
        int ggg = (int)(Math.random()*a.length);
        //System.out.println(List.get(1).getArtist().equals(current.getArtist())+""+eee);
        while (t){
            if(List.get(ggg).getArtist().equals(current.getArtist())){
                if(a[ggg]!=0){
                t=false;
                a[ggg]=0;
                current = List.get(ggg);
                return List.get(ggg);
            }else{
                eee++;
                ggg++;
            }
            }else{
                eee++;
                if(eee>=a.length){
                    eee=0;
                    ccc=0;
                    ggg=ggg-a.length;
                    for(int x =0; x<a.length;x++){
                        a[x]=1;
                        //System.out.println(a[x]);
               }
             }
            }
            //System.out.println(List.get(1).getArtist().equals(List.get(1).getArtist())+""+eee);
            //System.out.println("2");
        }
    }
    //System.out.println("1");
    return List.get(0);
    }
    public Song getNext(){
        
        Song s;
        if(state !=1){
        h = new int[List.size()];
        state = 1;
    }
        
        //System.out.println(a.length);
        int l=h.length;
        if(rrr==0){
        //int[] a = new int[List.size()];
        //System.out.println(a.length);
         l = h.length;
        for(int x =0; x<l;x++){
            h[x]=1;
        }
        
        for(int x =0;x<l;x++){
            Random.add(List.get(x));
        }
        rrr=1;
    }
    if(fff>=h.length){
        fff=0;
        rrr=0;
    }
    //System.out.println(fff);
    h[fff]=0;
    
     s = List.get(fff);
     fff++;
     return s;
    }
    public String toString(){
        String to = "";
        for(int ttt = 0; ttt<List.size(); ttt++){
            to=to.concat(""+List.get(ttt).toString()+"\r");
        }
        return to;
    }
}
