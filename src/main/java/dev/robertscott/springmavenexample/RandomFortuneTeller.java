package dev.robertscott.springmavenexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneTeller implements FortuneTeller {
    private String[] fortunes = {
       "Today is your lucky day",
       "Today you will win the lottery",
       "Today you will win the National"
    };

    @Override
    public String getFortune() {
        Random random = new Random();
        int index = random.nextInt(3);
        return fortunes[index];
    }
}
