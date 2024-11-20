package xyz.codenestsolucoes.screenmatch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.codenestsolucoes.screenmatch.dto.MediaDTO;
import xyz.codenestsolucoes.screenmatch.model.MediaModel;
import xyz.codenestsolucoes.screenmatch.model.MovieModel;
import xyz.codenestsolucoes.screenmatch.model.SerieModel;

import java.util.Objects;
import java.util.OptionalInt;

@Service
public class MediaService {
    @Autowired
    protected ApiCosumer apiConsumer;

    @Autowired
    protected DataConverter dataConverter;

    protected final String baseURL = "https://www.omdbapi.com/?apikey=7073d8c5";

    public MediaModel getMediaById(String imdbID) {
        String url = baseURL + "&i=" + imdbID;
        String json= apiConsumer.getData(url);
        MediaDTO dto = dataConverter.getData(json, MediaDTO.class);
        return determineMediaType(dto);
    }

    public MediaModel getMediaByName(String name) {
        String url = this.baseURL + "&t=" + name;
        String json = this.apiConsumer.getData(url);
        MediaDTO dto = this.dataConverter.getData(json, MediaDTO.class);
        return determineMediaType(dto);
    }

    public MediaModel determineMediaType(MediaDTO mediaDTO) {
        if(Objects.equals(mediaDTO.tipo(), "movie")) {
            MovieModel model = new MovieModel(mediaDTO);
            return new MovieModel(mediaDTO);
        } else if (Objects.equals(mediaDTO.tipo(), "series")) {
            return new SerieModel(mediaDTO);
        } else {
            return null;
        }
    }

}
