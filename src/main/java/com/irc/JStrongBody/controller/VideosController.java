package com.irc.JStrongBody.controller;

import com.irc.JStrongBody.model.Teg;
import com.irc.JStrongBody.model.Video;
import com.irc.JStrongBody.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideosController {

    @Autowired
    private VideosService service;

    @PostMapping("/videos")
    public Video create(@RequestBody Video video){

        return video;
    }
}
