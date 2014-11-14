package asteroids;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Ship extends Polygon
{
	boolean isWpressed = false;
	boolean otherKeyPressed = false;
	int shipHeight = 30;
	int shipWidth = 50;
	int wingHeight = 50;
	int wingWidth = 10;
	public int screenWidth = Asteroids.width;
	public int screenHeight = Asteroids.height;
	
	public Ship(Point[] s, Point p, double r)
	{
		super(s,p,r);
	}
	
	public void paint(Graphics brush)
	{
		int [] p1 = {(screenWidth / 2) - (shipWidth / 2),(screenWidth / 2) + (shipWidth / 2),(screenWidth / 2) - (shipWidth / 2)};
		int [] p2 = {(screenHeight / 2) - (shipHeight / 2),screenHeight / 2,(screenHeight / 2) + (shipHeight / 2)};
		  brush.drawLine((screenWidth / 2) - (shipWidth / 2), (screenHeight / 2) - (shipHeight / 2) - 5, (screenWidth / 2) - (shipWidth / 2) + shipHeight, (screenHeight / 2) - (shipHeight / 2) - 5);
		  brush.drawLine((screenWidth / 2) - (shipWidth / 2), (screenHeight / 2) + (shipHeight / 2) + 5, (screenWidth / 2) - (shipWidth / 2) + shipHeight, (screenHeight / 2) + (shipHeight / 2) + 5);
		  
		  brush.drawRect((screenWidth / 2) - (shipWidth / 2) - wingWidth, (screenHeight / 2) - (shipWidth / 2), wingWidth, wingHeight);
   		  brush.drawPolyline(p1, p2, 3);
		  
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keyCode = e.getKeyCode();
		switch(keyCode)
		{
			case KeyEvent.VK_W:
				isWpressed = true;
				break;
			default:
				otherKeyPressed = true;
		}
	}
	
	public void keyReleased(KeyEvent e)
	{
		int keyCode = e.getKeyCode();
		switch(keyCode)
		{
			case KeyEvent.VK_W:
				isWpressed = false;
				break;
			default:
				otherKeyPressed = false;
		}
	}
	
	public void keyTyped(KeyEvent e)
	{
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
