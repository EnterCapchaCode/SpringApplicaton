package org.spring.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Genres genre;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public void playMusic(Genres genre) {
        switch (genre){
            case RAP:
                System.out.println(rapMusic.getSong());
                break;
            case ROCK:
                System.out.println(rockMusic.getSong());
                break;
            default:
                System.out.println(classicalMusic.getSong());
                break;
        }
    }
}
