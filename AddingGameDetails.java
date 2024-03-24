import java.util.*;

public class AddingGameDetails {
    
    static LinkedList<GameDetails> gameList = new LinkedList<>();

    public LinkedList<GameDetails> addingDetails() {

        GameDetails g1 = new GameDetails("Counter-Strike 2", "Free", "Steam", "Valve", "85gb");

        GameDetails g2 = new GameDetails("Valorant", "Free", "Epic Games", "Riot Games", "50gb");

        GameDetails gameDetails = new GameDetails();

        gameDetails.setName("Hemanth");
        gameDetails.setPrice("He");
        gameDetails.setSource("kjhasxd");
        gameDetails.setDeveloper("asdf");
        gameDetails.setStorage("sdf");

        gameList.add(gameDetails);

        gameList.add(g1);
        gameList.add(g2);

        gameList.add(new GameDetails("Kiran","free","sd","asd","sd"));

        return gameList;
    }
}
