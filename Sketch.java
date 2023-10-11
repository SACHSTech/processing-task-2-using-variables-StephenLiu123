import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
  size(500, 500);
}

/** 
 * Called once at the beginning of execution.  Add initial set up
 * values here i.e background, stroke, fill etc.
 */
public void setup() {
  background(255, 179, 0);
}

/**
 * Called repeatedly, anything drawn to the screen goes here
 */
public void draw() {
  
// Draw Head For Noob
  fill(355, 219, 99);
  ellipse(width/2.1, height/5, height/5, height/5);

// Draw Body For Noob
  fill(99, 190, 255);
  rect(width/1.2, height/3.3, width/3.1, width/3.1);

// Draw Left Arm For Noob
  fill(355, 219, 99);
  rect(width/4.3, height/3.3, width/10, height/3.1);

// Draw Right Arm For Noob
  fill(355, 219, 99);
  rect(width/1.7, height/3.3, width/10, height/3.1);

// Draw Lower Body For Noob
  fill(139, 227, 73);
  rect(width/3, height/1.6, width/3.76, height/3.3);

// Draw Left Leg to Separate Left and Right Leg
  fill(139,227,73);
  rect(width/3, height/1.6, width/7.5, height/3.3);

// Draw Balloon
  fill(75, 242, 184);
  ellipse(width/1.4, height/10, width/7.1, height/7.1);

// Draw String Attached to Balloon and Noob Right Arm
  line(width/1.4, height/5.8, width/1.4, height/1.67);}
  
  }