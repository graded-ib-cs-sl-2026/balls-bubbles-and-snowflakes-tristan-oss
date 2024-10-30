import processing.core.PApplet;

public class Sketch extends PApplet {

    /** Represents one ball */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    private Bubble bubble1;

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

        bubble1 = new Bubble(this, 20, 20, 30, 4,5);
        

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
    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
