package xyz.codenestsolucoes.screenmatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xyz.codenestsolucoes.screenmatch.model.MediaModel;
import xyz.codenestsolucoes.screenmatch.service.MediaService;

@Controller
public class MediaController {

    @Autowired
    private MediaService mediaService;

    public MediaModel getMediaById(String imdbID) {
        return mediaService.getMediaById(imdbID);
    }
}
