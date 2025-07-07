package database;

public class DVD {
    private String title;
    private String director;
    private int playingTime;
    private boolean gotIt = false;// in seconds
    private String comment;

    /** 构造器*/
    public DVD(String title, String director, int playingTime, String comment) {
        this.title = title;
        this.director = director;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public void print() {
        System.out.println("DVD:"+"Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Playing Time: " + playingTime + " seconds");
        System.out.println("Got it: " + (gotIt ? "Yes" : "No"));
        System.out.println("Comment: " + comment);
    }
}
