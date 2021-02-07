package database;

public class CD extends Item {
    private String title;
    private String artist;
    private int numofTracks;
    private int playingtime;
    private boolean gotIt = false;
    private String comment;

    public CD(String title, String artist, int numofTracks, int playingtime, String comment) {
        this.title = title;
        this.artist = artist;
        this.numofTracks = numofTracks;
        this.playingtime = playingtime;
        this.comment = comment;
    }

    public void print() {
        System.out.println("CD:" + title + ":" + artist);
    }

    public static void main(String[] args) {

    }
}
