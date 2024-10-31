import processing.core.PApplet;

public class Sketch extends PApplet {

    /** Represents one ball */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    private Bubble bubble1;
    private Bubble bubble2;
    private Bubble bubble3;
    private Bubble bubble4;

    private Snowflake snowFlake1;
    private Snowflake snowFlake2;
    private Snowflake snowFlake3;
    private Snowflake snowFlake4;


    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
    public void setup() {
        ball1 = new Ball(this);

        ball2 = new Ball(this, 45, 200, 73, 2,2);
        ball2.setColors(color(35,196,145),color(0,0,0));

        ball3 = new Ball(this, 27, 82, 45, 4,3);
        ball3.setColors(color(71,187,191),color(255,255,255));

        ball4 = new Ball(this, 12, 20, 30, 4,5);
        ball4.setColors(color(45,98,189),color(255,255,255));

        bubble1 = new Bubble(this, 30, 400, 40, 1,-5); // note for snowflakes: set Y speed value high for it to fall from top
        
        bubble2 = new Bubble(this, 50, 300, 27, 1,-3);

        bubble3 = new Bubble(this, 23, 450, 45, 1,-3);

        bubble4 = new Bubble(this, 34, 100, 18, 1,-4);

        snowFlake1 = new Snowflake(this, 55, 400, 47, 1,6);

        snowFlake2 = new Snowflake(this, 20, 44, 100, 1,3);

        snowFlake3 = new Snowflake(this, 34, 70, 200, 1,4);

        snowFlake4 = new Snowflake(this, 19, 50, 400, 1,4);



    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(180, 180, 255);
        ball1.draw();
        ball1.move();

        ball2.draw();
        ball2.move();

        ball3.draw();
        ball3.move();

        ball4.draw();
        ball4.move();

        bubble1.draw();
        bubble1.move();

        bubble2.draw();
        bubble2.move();

        bubble3.draw();
        bubble3.move();

        bubble4.draw();
        bubble4.move();

        snowFlake1.draw();
        snowFlake1.move();

        snowFlake2.draw();
        snowFlake2.move();

        snowFlake3.draw();
        snowFlake3.move();

        snowFlake4.draw();
        snowFlake4.move();

        
    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
