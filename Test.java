package PP_class_1;


/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    public static void main(String[]args){
        
        Playlist ted = new Playlist();
        //Song tttt = new Song("a","b","c");
        //System.out.println(tttt);
        //System.out.println(ted.toString());
        ted.addSong(new Song("a","a","c"));
        ted.addSong(new Song("b","a","c"));
        ted.addSong(new Song("c","b","c"));
        ted.addSong(new Song("d","b","c"));
        ted.addSong(new Song("e","b","c"));
        ted.addSong(new Song("f","a","c"));
        ted.addSong(new Song("g","b","c"));
        ted.addSong(new Song("h","a","c"));
        System.out.println(""+ted.toString());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getRandomNext().getName());System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getRandomNext().getName());System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getRandomNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
        System.out.println(ted.getNext().getName());
    }
}
