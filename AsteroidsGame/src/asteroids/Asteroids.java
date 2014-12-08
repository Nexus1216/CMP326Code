package asteroids;

/*
CLASS: Asteroids
DESCRIPTION: Extending Game, Asteroids is all in the paint method.
NOTE: This class is the metaphorical "main method" of your program,
      it is your control center.
Original code by Dan Leyzberg and Art Simon
*/
import java.awt.*;
import java.awt.event.*;

class Asteroids extends Game {
	static int counter = 0;
	static boolean gameOver = false;
	private Point[] s = {new Point((width / 2) - (Ship.shipWidth / 2),(height / 2) - (Ship.shipHeight / 2)), 
			new Point((width / 2) + (Ship.shipWidth / 2),height / 2), 
			new Point((width / 2) - (Ship.shipWidth / 2),(height / 2) + (Ship.shipHeight / 2))};
	private Point p = new Point(width / 2, height /2);
	private double r = 0;
	public static double moveSpeed = 2;
	public Ship player = new Ship(s,p,r);
	
	private Point[] a = {new Point(0,0), new Point(50,0), new Point(100,50), new Point(100,50), new Point(160,50),
			new Point(130,150), new Point(180,200), new Point(210,250), new Point(130,300) , new Point(130,350), 
			new Point(70,330), new Point(30,380), new Point(-20,350), new Point(-60,290), new Point(-110,280), 
			new Point(-110,220), new Point(-60,170), new Point(-110,130), new Point(-110,80), new Point(-50,60)};
	private Point p0 = new Point(0 - width / 2, 0 - height /2);
	private Point p1 = new Point(width + width / 2, 0 - height /2);
	private Point p2 = new Point(width + width / 2, height + height /2);
	private Point p3 = new Point(0 - width / 2, height + height /2);
	private double r1 = 0;
	
	private Asteroid[] comit = {new Asteroid(a,p0,r1,1,1, player), new Asteroid(a,p1,r1,-1.2,1.1, player), new Asteroid(a,p2,r1,-1.5,-1.4, player), 
			new Asteroid(a,p3,r1,1.3,-1.1, player)};

  public Asteroids() {
    super("Asteroids!",1600,1200);
    this.setFocusable(true);
	this.requestFocus();
	this.addKeyListener(player);
	
  }
  
	public void paint(Graphics brush) {
    	brush.setColor(Color.black);
    	brush.fillRect(0,0,width,height);
    	
    	// sample code for printing message for debugging
    	// counter is incremented and this message printed
    	// each time the canvas is repainted
    	counter++;
    	brush.setColor(Color.white);
    	
    	if(!gameOver)
    	{
    		brush.setFont(getFont().deriveFont(25.0f));
    		brush.drawString("Sheilds " + player.sheilds,10,35);
    	}
    	if(player.sheilds <= 0)
    	{
    		brush.setFont(getFont().deriveFont(50.0f));
    		gameOver = true;
    		brush.drawString("-GAME OVER-", width/2 - 200,height/2);
    	}
    		player.paint(brush);
    		comit[0].paint(brush);
    		comit[1].paint(brush);
    		comit[2].paint(brush);
    		comit[3].paint(brush);
    	
    	
    	
  }
	
	
  
	public static void main (String[] args) 
	{
   		Asteroids a = new Asteroids();
   		
		a.repaint();
		
		
	}
}