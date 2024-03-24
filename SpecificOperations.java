import java.io.*;
import java.util.*;

public class SpecificOperations {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public LinkedList<GameDetails> addDetails() throws Exception {

        LinkedList<GameDetails> returnList = new LinkedList<>();
        
        while ( true ) {

            System.out.println("Enter Name of the Game : ");
            String name = br.readLine();
            
            System.out.println("Enter Price of the Game : ");
            String price = br.readLine();

            System.out.println("Enter Source of the Game : ");
            String source = br.readLine();

            System.out.println("Enter Developer of the Game : ");
            String developer = br.readLine();

            System.out.println("Enter Storege of the Game : ");
            String storage = br.readLine();

            GameDetails g = new GameDetails(name,price,source,developer,storage);

            returnList.add(g);

            System.out.println("no :- to stop adding details");
            System.out.println("yes :- to continue adding details");
            String choice = br.readLine();
            if ( choice.equalsIgnoreCase("no") ) {
                break;
            }
        }
        return returnList;        
    }

    public void deleteDetails(LinkedList<GameDetails> gameList) throws Exception {

        while ( true ) {

            System.out.println("Enter the game you want to delete");
            String gameForDeletion = br.readLine();

            ListIterator<GameDetails> it = gameList.listIterator();
            int count = 0;

            while ( it.hasNext() ) {

                GameDetails gd = (GameDetails)it.next();
                if ( !(gd.getName().equals(gameForDeletion)) ) {
                    count++;
                } 
                else {
                    break;
                }  
            }

            gameList.remove(count);

            System.out.println("no :- to stop Deleting details");
            System.out.println("yes :- to continue Deleting details");
            String choice = br.readLine();
            if ( choice.toLowerCase().equals("no") ) {
                break;
            }
        }       
    }

    public void updateDetails(LinkedList<GameDetails> gameList) throws Exception {

        while ( true ) {

            System.out.println("Enter the Name of the game you want to Update : ");
            String temp = br.readLine();

            System.out.println("Enter the choice for the field you want to update. ");
            System.out.println("1 :- Name");
            System.out.println("2 :- Price");
            System.out.println("3 :- Source");
            System.out.println("4 :- Developer");
            System.out.println("5 :- Storage");

            int field = Integer.parseInt(br.readLine());

            System.out.println("Enter the new value for the field : ");
            String newFeild = br.readLine();

            ListIterator<GameDetails> it = gameList.listIterator();

            while ( it.hasNext() ) {

                GameDetails gd = (GameDetails)it.next();
    
                if ( gd.getName().equals(temp) ) {
                    switch (field) {
                        case 1:
                            gd.setName(newFeild);
                            break;
                        case 2:
                            gd.setPrice(newFeild);
                            break;
                        case 3:
                            gd.setSource(newFeild);
                            break;
                        case 4:
                            gd.setDeveloper(newFeild);
                            break;
                        case 5:
                            gd.setStorage(newFeild);
                            break;
                        default:
                            System.out.println("Enter a valid Feild.");
                    }
                }
            }

            System.out.println("no :- to stop Updating details");
            System.out.println("yes :- to continue Updating details");
            String choice = br.readLine();
            if ( choice.toLowerCase().equals("no") ) {
                break;
            }
        }  
    }

    public void displayDetails(LinkedList<GameDetails> gameList) {

        ListIterator<GameDetails> it = gameList.listIterator();

        while ( it.hasNext() ) {

            GameDetails gd = (GameDetails)it.next();

            System.out.println(gd.name + " " + gd.price + " " + gd.source + " " + gd.developer + " " + gd.storage);
        }
    }

}
