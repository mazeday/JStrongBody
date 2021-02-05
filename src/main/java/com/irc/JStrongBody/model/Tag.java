package com.irc.JStrongBody.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Tag {

    private int id;
    private String name;

    public Tag(String name) {
        this.name = name;
    }
}
