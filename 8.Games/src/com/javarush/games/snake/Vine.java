package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.Random;

public class Vine extends Apple {
    private static String VINE;
    private static Random random = new Random();
    public boolean isAlive = true;
    public Vine(int x, int y) {
        super(x, y);
        int count = random.nextInt(3);
        if (count == 0) VINE = "\uD83C\uDF79";
        if (count == 1) VINE = "\uD83C\uDF77";
        if (count == 2) VINE = "\uD83C\uDF78\u200B";

    }

    public void draw(Game game) {
        Color ColorApple = isAlive ? Color.DARKSLATEBLUE: Color.RED;

        game.setCellValueEx(x,y, Color.NONE,VINE,ColorApple,75);
        //game.setCellValue(x,y,APPLE_SIGN);
    }
}
