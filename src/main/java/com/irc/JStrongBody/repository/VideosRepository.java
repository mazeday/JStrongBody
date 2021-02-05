package com.irc.JStrongBody.repository;

import com.irc.JStrongBody.model.Tag;
import com.irc.JStrongBody.model.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VideosRepository {
    public List<Video> getVideoToTag(Tag tag) {

        List<Video> listVideo =new ArrayList<Video>();
        Video video = new Video();
        listVideo.add(video);
        return listVideo;
    }
}
