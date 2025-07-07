package database;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<CD> listCD = new ArrayList<CD>();
    private ArrayList<DVD> listDVD = new ArrayList<DVD>();
    /** 函数的重载 名称一样 参数表不同*/
    public void add(CD cd){
        listCD.add(cd);
    }
    public void add(DVD dvd){
        listDVD.add(dvd);
    }

    public void list(){
        for(CD cd : listCD){
            cd.print();
        }
        for(DVD dvd : listDVD){
            dvd.print();
        }
    }
    public static void main(String [] args) {
        DataBase db = new DataBase();
        db.add(new CD("The Dark Side of the Moon", "Pink Floyd", 10, 3600, "A classic album"));
        db.add(new CD("Abbey Road", "The Beatles", 17, 3600, "Iconic album"));
        db.add(new CD("Back in Black", "AC/DC", 10, 3600, "Hard rock masterpiece"));
        db.add(new CD("Thriller", "Michael Jackson", 9, 3600, "Best-selling album of all time"));
        db.list();
        db.add(new DVD("Inception", "Christopher Nolan", 8880, "Mind-bending thriller"));
        db.add(new DVD("The Godfather", "Francis Ford Coppola", 10800, "Crime drama masterpiece"));
        db.add(new DVD("The Shawshank Redemption", "Frank Darabont", 8520, "Inspirational drama"));
    }
}
