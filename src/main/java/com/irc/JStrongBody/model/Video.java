package com.irc.JStrongBody.model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Video {

    private int id;

    private List<Tag> tegs;

    private String link;

    public Video(List<Tag> tegs, String link) {
        this.tegs = tegs;
        this.link = link;
    }
}
