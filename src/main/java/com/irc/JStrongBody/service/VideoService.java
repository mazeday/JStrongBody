package com.irc.JStrongBody.service;

import com.irc.JStrongBody.model.Tag;
import com.irc.JStrongBody.model.Video;
import com.irc.JStrongBody.repository.VideosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    @Autowired
    private VideosRepository repository;

    public Video createVideos(Video video) {

        return video;
    }

    public String deleteVideos(String stringId) {

        int id = stringToInt(stringId);

        return "sucsess delete";
    }

    private int stringToInt(String id){

        return Integer.parseInt (id);
    }

    public Tag getVideos(String id) {
        return null;
    }
}
