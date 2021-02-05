package com.irc.JStrongBody.service;

import com.irc.JStrongBody.model.Tag;
import com.irc.JStrongBody.model.VideoList;
import com.irc.JStrongBody.repository.VideoListRepository;
import com.irc.JStrongBody.repository.VideosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoListService {

    private VideoListRepository repository;

    private VideosRepository videosRepository;

    public void getVideoList(){

    }

    public VideoList createVideoList(Tag tag){
        VideoList videoList = new VideoList();
        videoList.setVideos(videosRepository.getVideoToTag(tag));
        return videoList;
    }
}
