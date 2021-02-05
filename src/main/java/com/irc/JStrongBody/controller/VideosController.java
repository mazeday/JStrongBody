package com.irc.JStrongBody.controller;

import com.irc.JStrongBody.model.Tag;
import com.irc.JStrongBody.model.Video;
import com.irc.JStrongBody.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VideosController {

    @Autowired
    private VideoService service;

    @PostMapping("/videos")
    public Video create(@RequestBody Video video){

        return service.createVideos(video);
    }

    @GetMapping("/videos{id}")
    public Tag getVideos(@PathVariable(name = "id") String id){
        return service.getVideos(id);
    };

    @DeleteMapping(value = "/videos/{id}")
    public String delete(@PathVariable(name = "id") String id){

        return service.deleteVideos(id);
    }
}
