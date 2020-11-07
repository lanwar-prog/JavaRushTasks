package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {
    public static final int WIDTH =15;
    public static final int HEIGHT =15;
    private static final int GOAL =10;
    private Snake snake;
    private int turnDelay;
    private Apple apple;
    private Vine vine;
    private boolean isGameStopped;
    private int score;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    @Override
    public void onTurn(int step) {
        snake.move(apple);
        if (apple.isAlive == false) {
            createNewApple();
            setScore(score += 5);
            if(apple.getClass() == Apple.class) setTurnTimer(turnDelay -= 20);
        }
        if (snake.isAlive ==false) gameOver();
        if (snake.getLength() > GOAL) win();
        drawScene();
    }

    @Override
    public void onKeyPress(Key key) {

        switch (key){
            case LEFT:
                    snake.setDirection(Direction.LEFT);
            break;
            case RIGHT:
                    snake.setDirection(Direction.RIGHT);
            break;
            case UP:
                    snake.setDirection(Direction.UP);
            break;
            case DOWN:
                    snake.setDirection(Direction.DOWN);
            break;
            case SPACE:
                if (isGameStopped) {
                    this.apple = null;
                    createGame();
                    break;
                }
        }

    }
    private void createNewApple(){
        do  {
            int x = getRandomNumber(WIDTH);
            int y = getRandomNumber(HEIGHT);
            if (apple ==null|| apple.getClass() == Apple.class ) {
                apple = new Vine(x, y);
            }else {

                apple = new Apple(x, y);
            }
        } while (snake.checkCollision(apple));


    }

    private void createGame(){
        turnDelay = 300;
        setTurnTimer(turnDelay);
        score =0;
        setScore(score);
        isGameStopped = false;
        snake= new Snake(WIDTH/2,HEIGHT/2);
        createNewApple();
        drawScene();


    }
    private void gameOver(){
        stopTurnTimer();
        isGameStopped =true;
        showMessageDialog(Color.NONE, "-----------------GAME OVER--------------- \n You're not good enough, drink more wine \uD83D\uDE09", Color.RED, 25);
    }
    private void win(){
        stopTurnTimer();
        isGameStopped =true;
        showMessageDialog(Color.NONE, "-----------------YOU WIN--------------- \nYou should less drink and hang out! \uD83D\uDE07", Color.BLUE, 25);
    }
    private void drawScene() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellValueEx(x, y, Color.WHEAT,"");
            }
        }
        snake.draw(this);
        apple.draw(this);
    }
}
