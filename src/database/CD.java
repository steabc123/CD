package database;

/**
 * CD扩展了Item类
 * CD类，继承自Item类
 * 用于表示音乐CD的相关信息
 */
public class CD extends Item{
    private String title;
    private String artist;
    private int numofTracks;
    private int playingTime;
    private boolean gotIt = false;// in seconds
    private String comment;

    /** 构造器*/
    public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        super(title);
//        this.title = title;
        this.artist = artist;
        this.numofTracks = numofTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public void print() {
        System.out.println("CD:"+"Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Number of Tracks: " + numofTracks);
        System.out.println("Playing Time: " + playingTime + " seconds");
        System.out.println("Got it: " + (gotIt ? "Yes" : "No"));
        System.out.println("Comment: " + comment);
    }
}
