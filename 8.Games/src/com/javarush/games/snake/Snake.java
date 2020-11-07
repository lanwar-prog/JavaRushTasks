package com.javarush.games.snake;
import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snake {
    private static final String HEAD_SIGN = "\uD83D\uDC69\u200D";
    private static final String BODY_SIGN = "\uD83D\uDC76";
    //private static Random random = new Random();
    public boolean isAlive = true;
    private List<GameObject> snakeParts;
    private int snakeLength =1;
    private Direction direction =Direction.LEFT;




    public Snake(int x, int y){
        //Генератор хвоста
//        int count = random.nextInt(3);
//        if (count == 0) BODY_SIGN = "\uD83D\uDC76";
//        if (count == 1)BODY_SIGN = "\uD83D\uDC66\u200B";
//        if (count == 2) BODY_SIGN = "\uD83D\uDC76\uD83C\uDFFE";

        snakeParts =new ArrayList<>();
           for (int i = 0; i < snakeLength ; i++) {
               snakeParts.add(new GameObject(x+i,y));
           }
    }
    public GameObject createNewHead(){
        if (direction == Direction.LEFT) {
            return new GameObject(snakeParts.get(0).x-1, snakeParts.get(0).y);
        }else if ( direction == Direction.RIGHT){
            return new GameObject(snakeParts.get(0).x+1, snakeParts.get(0).y);
        }else if ( direction == Direction.UP){
            return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y-1);
        }else if ( direction == Direction.DOWN){
            return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y+1);
        }
        return null;

    }
    public void setDirection(Direction direction) {

        switch (direction){
            case LEFT:
                if (snakeParts.size() ==1){
                    this.direction = direction;
                }else if (this.direction != Direction.RIGHT && snakeParts.get(0).y != snakeParts.get(1).y) {
                    this.direction = direction;
                }
                break;
            case RIGHT:
                if (snakeParts.size() ==1){
                    this.direction = direction;
                } else if (this.direction != Direction.LEFT && snakeParts.get(0).y!=snakeParts.get(1).y){
                    this.direction = direction;
                }
                break;
            case UP:
                if (snakeParts.size() ==1){
                    this.direction = direction;
                } else if (this.direction != Direction.DOWN && snakeParts.get(0).x!=snakeParts.get(1).x){
                    this.direction = direction;
                }
                break;
            case DOWN:
                if (snakeParts.size() ==1){
                    this.direction = direction;
                } else if (this.direction != Direction.UP && snakeParts.get(0).x!=snakeParts.get(1).x){
                    this.direction = direction;
                }
                break;
        }
        //this.direction = direction;
    }
    public void removeTail(){
        snakeParts.remove(snakeParts.size()-1);
    }

    public boolean checkCollision(GameObject game){
        for (GameObject part: snakeParts) {
        //}
        //for (int i = 0; i < snakeParts.size(); i++) {
            if (game.x == part.x && game.y == part.y) {
                return true;
            }
        }
        return false;
    }
    public void move(Apple apple){
        GameObject newHead = createNewHead();
        if (newHead.x<0||newHead.x >=SnakeGame.WIDTH|| newHead.y< 0||newHead.y>=SnakeGame.HEIGHT) {
            isAlive = false;
            return;
        }
        if (checkCollision(newHead)) {
            isAlive = false;
            return;
        }
            snakeParts.add(0, newHead);

        if (newHead.x == apple.x && newHead.y == apple.y && apple.isAlive) {
            apple.isAlive = false;

            if(apple.getClass() != Apple.class) removeTail();

        }else {
            removeTail();
        }

    }
    public int getLength(){
        return snakeParts.size();
    }
    public void draw(Game game) {

           Color ColorSnake = isAlive ? Color.BLACK: Color.RED;
        game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y,Color.NONE,HEAD_SIGN,ColorSnake,75);
        for (int i = 1; i < snakeParts.size(); i++) {
            game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y,Color.NONE, BODY_SIGN,ColorSnake,75);
        }

    }

}
