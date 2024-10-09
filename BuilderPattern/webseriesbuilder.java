package BuilderPattern;

public class webseriesbuilder {
    private String type;
    private String name;
    private int episodes;
    private Double rating;
    private Double duration;
    private String uc;//universal certificate
    
    public webseriesbuilder settype(String type)
    {
        this.type = type;
        return this;
    }
    public webseriesbuilder setname(String name)
    {
        this.name = name;
        return this;
    }
    public webseriesbuilder setepisodes(int episodes)
    {
        this.episodes=episodes;
        return this;
    }
    public webseriesbuilder setrating(Double rating)
    {
        this.rating = rating;
        return this;
    }
    public webseriesbuilder setduration(Double duration)
    {
        this.duration = duration;
        return this;
    }
    public webseriesbuilder setuc(String uc)
    {
        this.uc = uc;
        return this;
    }
    public webseries getWebseries()
    {
        return new webseries(this.type, this.name, this.uc, this.episodes, this.rating, this.duration);
    }
}