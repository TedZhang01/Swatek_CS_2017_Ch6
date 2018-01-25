package PP_class_1;


public class Song{
    private String name,artist,genre;
    public Song(String n, String a,String g){
        name = n;
        artist = a;
        genre = g;
        
    }
    public String getName(){
        return name;
    }
    public String getArtist(){
        return artist;
    }
    public String getGenre(){
        return genre;
    }
    public String toString(){
        return (""+name+"\t"+artist+"\t"+genre);
    }
}