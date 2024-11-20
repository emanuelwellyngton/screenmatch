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
public class SerieController extends MediaController{

//    public SerieModel loadSerieByID(String imdbID) {
//
//    }

//    public List<SeasonDTO> loadSeason(int totalSeasons, String baseURLSerie) {
//        var seasons = new ArrayList<SeasonDTO>();
//
//        for(int i = 1; i <= totalSeasons; i++) {
//            String jsonTemporada = this.omdbAPI.getData(baseURLSerie + "&season=" + i);
//
//            SeasonDTO temporada = dataConverter.getData(jsonTemporada, SeasonDTO.class);
//            seasons.add(temporada);
//        }
//
//        return seasons;
//    }
}
