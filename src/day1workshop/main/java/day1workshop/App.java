package day1workshop;

public class App {
    private String item;
    private int index;
    private String login;

    public String getItem() {return item;}
    public void setItem(String item) {this.item = item;}
    
    public int getIndex() {return index;}
    public void setIndex(int index) {this.index = index;}

    public String getLogin() {return login;}
    public void setLogin(String login) {this.login = login;}
    

    @Override
    public String toString() {
        return "ShoppingCart item = " + item + ", index = " + index + "]";
    }
    
}
