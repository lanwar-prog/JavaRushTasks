package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.Random;

public class Apple extends GameObject {
    private static String APPLE_SIGN; //"\uD83C\uDF4E"
    //private static final String VINE = "\uD83C\uDF79";
    private static Random random = new Random();
    public boolean isAlive = true;

    public Apple(int x, int y) {
        super(x, y);
        int count = random.nextInt(3);
        if (count == 0) APPLE_SIGN = "\uD83D\uDC68\u200D";
        if (count == 1) APPLE_SIGN = "\uD83E\uDDD1\uD83C\uDFFE";
        if (count == 2) APPLE_SIGN = "\uD83E\uDDD4";
    }

    public void draw(Game game) {
        Color ColorApple = isAlive ? Color.DARKSLATEBLUE: Color.RED;

        game.setCellValueEx(x,y, Color.NONE,APPLE_SIGN,ColorApple,75);
        //game.setCellValue(x,y,APPLE_SIGN);
    }
}
