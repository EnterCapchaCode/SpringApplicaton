package org.spring.application;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        String[] array = new String[]{"Drowning Pool - Bodies", "Disturbed - Sacred Lie", "Sabaton - Panzerkampf"};
        return array[(int)(Math.random()*3)];
    }
}
