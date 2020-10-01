import java.awt.Color;

import acm.graphics.GCanvas;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
/*
 * RobotFace.java extends GraphicsProgram
 * The program creates a canvas and adds GRect and GOval
 * objects to the canvas. The shape objects are set with the appropriate bounds
 * to illustrate a robot face.
 */
public class RobotFace extends GraphicsProgram {

	private static double HEAD_WIDTH = 200;
	private static double HEAD_HEIGHT = 300;
	private static double EYE_RADIUS = 35;
	private static double MOUTH_WIDTH = 110;
	private static double MOUTH_HEIGHT = 30;

	public void run() {
		
		// create robot face
		getRobotFace();

	}

	/*
	 * Adds all appropriately modified components to the canvas.
	 */
	public void getRobotFace() {
		// create the appropriate color canvas
		GCanvas gc = getColoredCanvas(Color.white);

		// get a centered head of appropriate size size.
		GRect head = getHead();

		// get the left eye
		GOval leftEye = getLeftEye();

		// get the right eye
		GOval rightEye = getRightEye();
		
		// get the mouth
		GRect mouth = getMouth();
		
		gc.add(head);
		gc.add(leftEye);
		gc.add(rightEye);
		gc.add(mouth);

	}
	
	public GRect getMouth() {
		double boundX = getWidth() / 2 - MOUTH_WIDTH / 2;
		double boundY = getHeight() / 2 + HEAD_HEIGHT / 4 - MOUTH_HEIGHT / 2;
		GRect mouth = new GRect(boundX, boundY, MOUTH_WIDTH, MOUTH_HEIGHT);
		
		mouth.setColor(Color.white);
		mouth.setFillColor(Color.white);
		mouth.setFilled(true);
		mouth.setVisible(true);
		
		return mouth;
	}

	/*
	 * returns a GOval object a quarter length from the right side of the head and a
	 * quarter length from the north side of the head.
	 */
	public GOval getRightEye() {
		GOval eye = new GOval(EYE_RADIUS, EYE_RADIUS);

		double canvasWidth = getWidth();
		double canvasHeight = getHeight();

		double boundX = (canvasWidth / 2) + (HEAD_WIDTH / 4) - EYE_RADIUS / 2;
		double boundY = (canvasHeight / 2) - (HEAD_HEIGHT / 4) - EYE_RADIUS / 2;

		eye.setBounds(boundX, boundY, EYE_RADIUS, EYE_RADIUS);

		eye.setColor(Color.gray);
		eye.setFillColor(Color.yellow);
		eye.setVisible(true);
		eye.setFilled(true);

		return eye;
	}

	/*
	 * returns a GOval object a quarter length from the left side of the head and a
	 * quarter length from the north side of the head.
	 */
	public GOval getLeftEye() {
		GOval eye = new GOval(EYE_RADIUS, EYE_RADIUS);

		double canvasWidth = getWidth();
		double canvasHeight = getHeight();

		double boundX = (canvasWidth / 2) - (HEAD_WIDTH / 4) - EYE_RADIUS / 2;
		double boundY = (canvasHeight / 2) - (HEAD_HEIGHT / 4) - EYE_RADIUS / 2;

		eye.setBounds(boundX, boundY, EYE_RADIUS, EYE_RADIUS);

		eye.setColor(Color.gray);
		eye.setFillColor(Color.yellow);
		eye.setVisible(true);
		eye.setFilled(true);

		return eye;
	}

	/*
	 * returns a GRect object centered in the canvas in the form
	 * of the robot head.
	 */
	public GRect getHead() {
		GRect head = new GRect(HEAD_WIDTH, HEAD_HEIGHT);

		double canvasWidth = getWidth();
		double canvasHeight = getHeight();
		double boundX = (canvasWidth / 2) - (head.getWidth() / 2);
		double boundY = (canvasHeight / 2) - (head.getHeight() / 2);

		head.setBounds(boundX, boundY, HEAD_WIDTH, HEAD_HEIGHT);
		head.setColor(Color.black);
		head.setFillColor(Color.gray);
		head.setVisible(true);
		head.setFilled(true);

		return head;
	}

	/*
	 * returns an appropriately sized head
	 */
	/*
	public GRect returnSizedHead(double width, double height) {
		// create a head with the GRect object
		GRect head = new GRect(width, height);

		return head;
	}
	*/

	/*
	 * returns a white canvas object with a white background.
	 */
	public GCanvas getColoredCanvas(Color color) {
		// create a canvas object
		GCanvas canvas = this.getGCanvas();
		// set the background color of the canvas object
		canvas.setBackground(color);

		return canvas;
	}

}
