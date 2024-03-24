/**
 * Product
 */
public class GameDetails {

    String name;
    String price;
    String source;
    String developer;
    String storage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    GameDetails( String name, String price, String source ,String developer , String storage ){
        this.name = name;
        this.price = price;
        this.source = source;
        this.developer = developer;
        this.storage = storage;
    }

    GameDetails(){

    }
}