package org.spring.application;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        String[] array = new String[]{"Ferenc List - Hungarian Rhapsody", "Vivaldi - Winter", "Yiruma - River Follows In You"};
        return array[(int)(Math.random()*3)];
    }
}
