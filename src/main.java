public class main {
    public static void main(String[] args){
//        System.out.println("Hello world");
        Game game= new GameBuilder()
                .homeTeam("Man")
                .awayTeam("Arsenal")
                .currentYardLine(23)
                .weather("Cold")
                .stadium("StanFord")
                .build();

    System.out.println(game.weather);

    }
}
