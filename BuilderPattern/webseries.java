package BuilderPattern;

public class webseries {
    private String type;
    private String name;
    private int episodes;
    private double rating;
    private double duration;
    private String uc;//universal certificate

    public webseries(String type,String name,String uc,int episodes,double rating,double duration)
    {
        this.type = type;
        this.name = name;
        this.uc = uc;
        this.episodes =episodes;
        this.rating = rating;
        this.duration = duration;
    }

    public String toString()
    {
        return "Name: "+name+"\nType: "+type+"\nepisodes: "+episodes+"\nRating: "+rating+"\nDuration: "+duration+"\nU/C: "+uc;
    }
}