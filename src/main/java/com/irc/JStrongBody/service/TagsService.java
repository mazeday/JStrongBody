package com.irc.JStrongBody.service;

import com.irc.JStrongBody.model.Tag;
import com.irc.JStrongBody.repository.TagsRepository;
import org.springframework.stereotype.Service;

@Service
public class TagsService {

    private TagsRepository repository;

    public Tag createTag(Tag tag) {

        repository.createTag(tag);

        return tag;
    }

    public String deleteTag(int id) {
        return null;
    }

    private int stringToInt(String id){

        return Integer.parseInt (id);
    }

    public Tag getTag(String id) {
        return null;
    }
}
