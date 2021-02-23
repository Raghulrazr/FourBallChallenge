import processing.core.PApplet;

class Balls{
    float ballHeightPosition;
    float ballSpeed;
    static float ballWidth = 10;
    static float ballHeight = 10;
    static float positionX1 = 0;
    static float positionX2 = 0;
    static float positionX3 = 0;
    static float positionX4 = 0;

    public Balls(float tempPosition, float tempSpeed) {
        ballHeightPosition = tempPosition;
        ballSpeed = tempSpeed;
    }
    public void speedIncrementBallOne(float speed){
        positionX1 = positionX1 + speed;
    }
    public void speedIncrementBallTwo(float speed){
        positionX2 = positionX2 + speed;
    }
    public void speedIncrementBallThree(float speed){
        positionX3 = positionX3 + speed;
    }
    public void speedIncrementBallFour(float speed){
        positionX4 = positionX4 + speed;
    }
}
public class OopFourBallChallenge extends PApplet {
    Balls ballOne;
    Balls ballTwo;
    Balls ballThree;
    Balls ballFour;

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    float speedBallOne = 1;
    float speedBallTwo = 2;
    float speedBallThree = 3;
    float speedBallFour = 4;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        int heightY = HEIGHT / 5;
        ballOne = new Balls(heightY, 1);
        ballTwo = new Balls(heightY * 2, 2);
        ballThree = new Balls(heightY * 3, 3);
        ballFour = new Balls(heightY * 4, 4);
    }

    @Override
    public void draw() {
        firstBall();
        secondBall();
        thirdBall();
        fourthBall();
    }

    private void fourthBall() {
        ellipse(Balls.positionX4, ballFour.ballHeightPosition, Balls.ballWidth, Balls.ballHeight);
        ballFour.speedIncrementBallFour(speedBallFour);
    }

    private void thirdBall() {
        ellipse(Balls.positionX3, ballThree.ballHeightPosition, Balls.ballWidth, Balls.ballHeight);
        ballThree.speedIncrementBallThree(speedBallThree);
    }

    private void secondBall() {
        ellipse(Balls.positionX2, ballTwo.ballHeightPosition, Balls.ballWidth, Balls.ballHeight);
        ballTwo.speedIncrementBallTwo(speedBallTwo);
    }

    private void firstBall() {
        ellipse(Balls.positionX1, ballOne.ballHeightPosition, Balls.ballWidth, Balls.ballHeight);
        ballOne.speedIncrementBallOne(speedBallOne);
    }

    public static void main(String[] args) {
        PApplet.main("OopFourBallChallenge", args);
    }
}

