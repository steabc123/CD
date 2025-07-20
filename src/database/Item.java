package database;

public class Item {
    protected String title;

    public Item(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Item");
    }
}
