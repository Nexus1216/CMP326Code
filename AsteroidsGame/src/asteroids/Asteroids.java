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
	
	private Point[] s = {new Point((width / 2) - (Ship.shipWidth / 2),(height / 2) - (Ship.shipHeight / 2)), 
			
		//	new Point((width / 2) - (Ship.shipWidth / 2), (height / 2) - (Ship.shipHeight / 2) - 5), 
		//	new Point((width / 2) - (width / 2) + Ship.shipHeight, (height / 2) - (Ship.shipHeight / 2) - 5),
		//	new Point((width / 2) - (Ship.shipWidth / 2), (height / 2) - (Ship.shipHeight / 2) - 5), 
			
			new Point((width / 2) + (Ship.shipWidth / 2),height / 2), 
			new Point((width / 2) - (Ship.shipWidth / 2),(height / 2) + (Ship.shipHeight / 2))};
	private Point p = new Point(width / 2, height /2);
	private double r = 0;
	private Ship player = new Ship(s,p,r);

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
    	brush.drawString("Counter is " + counter,10,10);
    	player.paint(brush);
    	//player.paint1(brush);
  }
	
	
  
	public static void main (String[] args) 
	{
   		Asteroids a = new Asteroids();
   		
		a.repaint();
		
		
	}
}