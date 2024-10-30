package xyz.codenestsolucoes.screenmatch.model;

import xyz.codenestsolucoes.screenmatch.dto.MediaDTO;
import xyz.codenestsolucoes.screenmatch.service.DataConverter;

public class MediaModel extends DataConverter {
    private String imdbID;
    private String title;
    private String year;
    private String poster;
    private String plot;
    private boolean watched;

    public MediaModel(MediaDTO dto) {
        this.setTitle(dto.titulo());
        this.setPlot(dto.plot());
        this.setImdbID(dto.id());
        this.setPoster(dto.poster());
        this.setYear(dto.ano());
    }

    public MediaModel() {}

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getPoster() {
        return poster;
    }

    public String getPlot() {
        return plot;
    }

    public boolean isWatched() {
        //TODO implement controller to communication with db
        return watched;
    }

    public void setWatched(boolean watched) {
        //TODO implement controller to communication with db
        this.watched = watched;
    }
}
