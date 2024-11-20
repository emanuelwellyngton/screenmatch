package xyz.codenestsolucoes.screenmatch.model;

import xyz.codenestsolucoes.screenmatch.dto.SeasonDTO;

import java.util.ArrayList;
import java.util.List;

public class SeasonModel {
    private List<EpisodeModel> episodes;
    private int number;
    private Status status;

    public SeasonModel(){}

    public SeasonModel(SeasonDTO dto) {
        this.number = dto.numero();
        this.episodes = loadEpisodes(dto);
    }

    public List<EpisodeModel> getEpisodes() {
        return episodes;
    }

    public int getNumber() {
        return number;
    }

    public Status getStatus() {
        //TODO implement controller to communication with db
        return status;
    }

    public void setStatus(Status status) {
        //TODO implement controller to communication with db
        this.status = status;
    }

    public List<EpisodeModel> loadEpisodes(SeasonDTO dto) {
        List<EpisodeModel> episodes = new ArrayList<>();

        dto.episodios().forEach((episodio) -> {
            String title = episodio.title();
            int number = episodio.number();
            String released = episodio.released();
            episodes.add(new EpisodeModel(title, number, released));
        });

        return episodes;
    }

    @Override
    public String toString() {
        return "SeasonModel{" +
                "episodes=" + episodes +
                ", number=" + number +
                ", status=" + status +
                '}';
    }
}
