package xyz.codenestsolucoes.screenmatch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import xyz.codenestsolucoes.screenmatch.dto.MediaDTO;

@Entity
public class MediaModel {
    @Id
    @Column(name="id_movie")
    private String id;
    @Transient
    private String title;
    @Transient
    private String year;
    @Transient
    private String poster;
    @Transient
    private String plot;
    private Status status;

    public MediaModel(MediaDTO dto) {
        this.setTitle(dto.titulo());
        this.setPlot(dto.sinopse());
        this.setId(dto.id());
        this.setPoster(dto.poster());
        this.setYear(dto.ano());
    }

    public MediaModel() {}

    public void setId(String imdbID) {
        this.id = imdbID;
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

    public String getId() {
        return id;
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

    public Status getStatus() {
        //TODO implement controller to communication with db
        return status;
    }

    public void setStatus(Status status) {
        //TODO implement controller to communication with db
        this.status = status;
    }
}
