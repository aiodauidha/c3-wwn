package database;

public class DVD extends Item {
    private String title;
    private String director;
    private int playingtime;
    private boolean gotIt = false;
    private String comment;

    public DVD(String title, String director, int playingtime, String comment) {
        this.title = title;
        this.director = director;
        this.playingtime = playingtime;
        this.comment = comment;
    }

    public void print() {
        System.out.println("DVD:" + title + ":" + director);
    }
    public static void main(String[] args) {

    }
}
