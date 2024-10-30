package xyz.codenestsolucoes.screenmatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xyz.codenestsolucoes.screenmatch.dto.MediaDTO;
import xyz.codenestsolucoes.screenmatch.dto.SeasonDTO;
import xyz.codenestsolucoes.screenmatch.model.SerieModel;
import xyz.codenestsolucoes.screenmatch.service.ApiCosumer;
import xyz.codenestsolucoes.screenmatch.service.DataConverter;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SerieController {
    private ApiCosumer omdbAPI;
    private DataConverter dataConverter;

    public SerieController(ApiCosumer api, DataConverter dataConverter) {
        this.omdbAPI = api;
        this.dataConverter = dataConverter;
    }

    public SerieModel loadSerieByID(String imdbID) {
        String baseURLSerie = "https://www.omdbapi.com/?i=" + imdbID + "&apikey=7073d8c5";
        String jsonSerie = this.omdbAPI.getData(baseURLSerie);
        MediaDTO serieObject = dataConverter.getData(jsonSerie, MediaDTO.class);
        List<SeasonDTO> seasons = loadSeason(serieObject.quantTemporadas(), baseURLSerie);
        return new SerieModel(serieObject, seasons);
    }

    public List<SeasonDTO> loadSeason(int totalSeasons, String baseURLSerie) {
        var seasons = new ArrayList<SeasonDTO>();

        for(int i = 1; i <= totalSeasons; i++) {
            String jsonTemporada = this.omdbAPI.getData(baseURLSerie + "&season=" + i);

            SeasonDTO temporada = dataConverter.getData(jsonTemporada, SeasonDTO.class);
            seasons.add(temporada);
            System.out.println(jsonTemporada);
        }

        return seasons;
    }
}
