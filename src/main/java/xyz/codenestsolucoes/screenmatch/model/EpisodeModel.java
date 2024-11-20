package xyz.codenestsolucoes.screenmatch.model;

public class EpisodeModel {
    private String title;
    private String released;
    private int number;
    private Status status;

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

    public String getReleased() { return released; }

    public Status getStatus() {
        //TODO implement controller to communication with db
        return status;
    }

    public void setStatus(Status status) {
        //TODO implement controller to communication with db
        this.status = status;
    }

    @Override
    public String toString() {
        return "EpisodeModel{" +
                "title='" + title + '\'' +
                ", number=" + number +
                ", status=" + status +
                '}';
    }
}
