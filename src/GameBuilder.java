public class GameBuilder {
    protected String homeTeam;
    protected String awayTeam;
    protected int currentYardLine;
    protected String weather;
    protected String stadium;

    public GameBuilder awayTeam(String name){
//        Set awayTeam here
        awayTeam=name;
        return this;
    }
    public GameBuilder homeTeam(String name){
//        Set homeTeam here
        homeTeam=name;
        return this;
    }
    public GameBuilder weather(String name){
//        Set weather here
        weather=name;
        return this;
    }
    public GameBuilder stadium(String name){
//        Set stadium here
        stadium=name;
        return this;
    }
    public GameBuilder currentYardLine(int  number){
//        Set currentYardLine here
        currentYardLine=number;
        return this;
    }

    public Game build(){
        if(homeTeam==null){
            throw new IllegalStateException("No Home Team");
        }else if(awayTeam==null){
            throw new IllegalStateException("No Away Team");
        }else if(currentYardLine==0){
            throw new IllegalStateException("No currentYardLine");
        }else if(weather==null){
            throw new IllegalStateException("No weather");
        }else if(stadium==null){
            throw new IllegalStateException("No stadium");
        }

        return new Game(this
        );
    }



}
