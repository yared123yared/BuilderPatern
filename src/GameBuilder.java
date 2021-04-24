public final class GameBuilder {
    private String homeTeam;
    private String awayTeam;
    private int currentYardLine;
    private String weather;
    private String stadium;

    public GameBuilder awayTeam(String name){
//        Set awayTeam here
        awayTeam=name;
        return this;
    }
    public GameBuilder homeTeam(String name){
//        Set awayTeam here
        homeTeam=name;
        return this;
    }
    public GameBuilder weather(String name){
//        Set awayTeam here
        weather=name;
        return this;
    }
    public GameBuilder stadium(String name){
//        Set awayTeam here
        stadium=name;
        return this;
    }
    public GameBuilder awayTeam(int  number){
//        Set awayTeam here
        currentYardLine=number;
        return this;
    }

}
