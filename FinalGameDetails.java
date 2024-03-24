import java.io.*;
import java.util.*;

public class FinalGameDetails {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static LinkedList<GameDetails> gameList = new LinkedList<>();

    static AddingGameDetails addingGameDetails = new AddingGameDetails();

    public void operations() throws Exception {        

        gameList = addingGameDetails.addingDetails();

        while ( true ) {

            System.out.println("OPerations are as follows : ");
            System.out.println("1 :- To add Details");
            System.out.println("2 :- To remove Details");
            System.out.println("3 :- To Update Details");
            System.out.println("4 :- To Display the Details");
            System.out.println("5 :- To stop doing Operations");

            int choice = Integer.parseInt(br.readLine());

            SpecificOperations specificOperations = new SpecificOperations();

            switch ( choice ) {
                case 1:
                    LinkedList<GameDetails> returnList = new LinkedList<>();
                    returnList = specificOperations.addDetails();
                    gameList.addAll(returnList);
                    break;
                case 2:
                    specificOperations.deleteDetails(gameList);               
                    break;
                case 3:
                    specificOperations.updateDetails(gameList);
                    break;
                case 4:
                    specificOperations.displayDetails(gameList);
                    break;
                case 5:
                    specificOperations.displayDetails(gameList);
                    break;
                default:
                    System.out.println("Enter a Valid Choice");
            }

            if ( choice == 5 ) {
                System.out.println("You Have stopped doing Operatins. Thank you");
                break;
            }
        }
    }
}
