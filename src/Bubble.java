

class Bubble {

    //MISSING MANY INSTANCE VARIABLES

    //MISSING CONSTRUCTORS

    // accessors for the radius, diameter, x, and y values 

    private Sketch s;
    /** the radius of the bubble */
    private float radius;
    private float x;
    private float y;
    /** The number of pixels the bubble moves right per frame */
    private float xSpeed;
    /** The number of pixels the bubble moves down per frame */
    private float ySpeed;
    /** The color of the inside of the bubble */
    private int fillColor;
    /** The color of the outside of the bubble */
    private int borderColor;


    public Bubble(Sketch sketch) {
        s = sketch;
        radius = 20;
        x = 100;
        y = 100;
        xSpeed = 2;
        ySpeed = -1;
        fillColor = s.color(100, 80, 20, 100);
        borderColor = s.color(0, 0, 0);
    }

    public Bubble(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }

    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void draw() {
        s.stroke(0, 0, 0);
        s.fill(00, 80, 20, 0); // usa RGBA (alpha) to handle transperency. Learned from Stackoverflow https://stackoverflow.com/questions/26243811/how-can-i-make-a-shape-transparent-in-java
        s.circle(x, y, radius*2);
        
    }

    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }

}
 