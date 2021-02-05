package com.irc.JStrongBody.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Calendar {
    private final Date startDay;

    private int date;

    public Calendar() {
        this.startDay = new Date();
    }
}
