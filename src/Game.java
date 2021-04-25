public class Game extends GameBuilder{

    public Game(GameBuilder builder){
         homeTeam  = builder.homeTeam;
         awayTeam = builder.awayTeam;
         currentYardLine = builder.currentYardLine;
         weather = builder.weather;
         stadium = builder.stadium;
    }

}
