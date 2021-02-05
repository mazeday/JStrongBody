package com.irc.JStrongBody.controller;

import com.irc.JStrongBody.model.Tag;
import com.irc.JStrongBody.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TagsController {

    @Autowired
    private TagsService service;

    @PostMapping("/tags")
    public Tag create(Tag tag){
        return service.createTag(tag);
    };

    @GetMapping("/tags{id}")
    public Tag getTag(@PathVariable(name = "id") String id){
        return service.getTag(id);
    };

    @DeleteMapping(value = "/tags/{id}")
    public String delete(@PathVariable(name = "id") String id){

        return service.deleteTag(id);
    }
}
