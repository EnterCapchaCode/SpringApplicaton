package org.spring.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = (int)(Math.random()*1000);
        this.musicPlayer = musicPlayer;
    }

    @PostConstruct
    public void initMethod(){
        System.out.println("Initialization complete!");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Destroy complete!");
    }

    public void showInfo(Genres genre) {
        System.out.println("Computer: " + id);
        musicPlayer.playMusic(genre);
    }
}

