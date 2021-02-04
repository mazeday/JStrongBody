package com.irc.JStrongBody.service;

import com.irc.JStrongBody.model.Teg;
import com.irc.JStrongBody.model.TegEnum;
import com.irc.JStrongBody.model.Video;
import com.irc.JStrongBody.repository.VideosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideosService {

    @Autowired
    private VideosRepository repository;

    public Video createVideos(List<Teg> tegs, String link) {

        Video video = new Video(tegs, link);

        return video;
    }
}
