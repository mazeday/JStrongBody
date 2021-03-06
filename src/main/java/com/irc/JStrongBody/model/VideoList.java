package com.irc.JStrongBody.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class VideoList {

    private List<Video> videos;

}
