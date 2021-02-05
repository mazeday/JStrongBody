package com.irc.JStrongBody.controller;

import com.irc.JStrongBody.model.Tag;
import com.irc.JStrongBody.model.VideoList;
import com.irc.JStrongBody.service.VideoListService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoListController {

    private VideoListService service;

    @PostMapping("/videoList")
    public VideoList create(@RequestBody Tag tag){

        return service.createVideoList(tag);
    }
}
