package xyz.codenestsolucoes.screenmatch.model;

public class EpisodeModel {
    private String title;
    private String released;
    private int number;
    private boolean watched;

    public EpisodeModel(){}

    public EpisodeModel(String title, int number, String released) {
        this.title = title;
        this.number = number;
        this.released = released;
    }

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }

    public boolean isWatched() {
        //TODO implement controller to communication with db
        return watched;
    }

    public void setWatched(boolean watched) {
        //TODO implement controller to communication with db
        this.watched = watched;
    }

    @Override
    public String toString() {
        return "EpisodeModel{" +
                "title='" + title + '\'' +
                ", number=" + number +
                ", watched=" + watched +
                '}';
    }
}
