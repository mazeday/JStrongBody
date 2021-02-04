package com.irc.JStrongBody.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Video {

    private int id;
    private List<Teg> tegs;
    private String link;

    public Video(List<Teg> tegs, String link) {
        this.tegs = tegs;
        this.link = link;
    }
}
