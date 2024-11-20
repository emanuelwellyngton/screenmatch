package xyz.codenestsolucoes.screenmatch.service;

import org.springframework.stereotype.Service;
import xyz.codenestsolucoes.screenmatch.dto.MediaDTO;
import xyz.codenestsolucoes.screenmatch.dto.SeasonDTO;
import xyz.codenestsolucoes.screenmatch.model.SerieModel;

import java.util.ArrayList;
import java.util.List;

public class SerieService extends MediaService{

    public SerieModel loadSerieByID(String imdbID) {
        String baseURLSerie = "https://www.omdbapi.com/?i=" + imdbID + "&apikey=7073d8c5";
        String jsonSerie = apiConsumer.getData(baseURLSerie);
        MediaDTO serieObject = dataConverter.getData(jsonSerie, MediaDTO.class);
        List<SeasonDTO> seasons = loadSeason(serieObject.quantTemporadas(), baseURLSerie);
        return new SerieModel(serieObject, seasons);
    }

    public List<SeasonDTO> loadSeason(int totalSeasons, String baseURLSerie) {
        var seasons = new ArrayList<SeasonDTO>();

        for(int i = 1; i <= totalSeasons; i++) {
            String jsonTemporada = this.apiConsumer.getData(baseURLSerie + "&season=" + i);

            SeasonDTO temporada = dataConverter.getData(jsonTemporada, SeasonDTO.class);
            seasons.add(temporada);
        }

        return seasons;
    }
}
