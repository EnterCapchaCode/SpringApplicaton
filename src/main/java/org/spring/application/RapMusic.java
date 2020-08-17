package org.spring.application;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    String[] array = new String[]{"ScHoolboy Q - JoHn Muir", "Token - Flamingo", "Bones - RestInPeace"};

    @Override
    public String getSong() {
        return array[(int)(Math.random()*3)];
    }
}
