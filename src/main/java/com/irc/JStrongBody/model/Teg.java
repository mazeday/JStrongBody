package com.irc.JStrongBody.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Teg {

    private int id;
    private TegEnum tegEnum;

    public Teg(TegEnum teg) {
        this.tegEnum = teg;
    }
}
