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

    public String deleteVideos(int id) {

        return "sucsess delete";
    }

    public Tag getVideos(int id) {
        return null;
    }
}
