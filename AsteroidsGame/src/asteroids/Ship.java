package asteroids;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ship extends Polygon implements KeyListener
{
	boolean isKeyUp = false;
	boolean isKeyLeft = false;
	boolean isKeyRight = false;
	int timer = 0;
	boolean isWpressed = false;
	boolean otherKeyPressed = false;
	static int shipHeight = 30;
	static int shipWidth = 50;
	static int wingHeight = 50;
	static int wingWidth = 10;
	public int screenWidth = Asteroids.width;
	public int screenHeight = Asteroids.height;
	public int sheilds = 100;
	
	public Ship(Point[] s, Point p, double r)
	{
		super(s,p,r);
	}
	
	
	public void keyPressed(KeyEvent e) 
	{
		
		
		int keyCode = e.getKeyCode();
	    switch( keyCode ) 
	    { 
	        case KeyEvent.VK_UP:
	            // handle up
	        	isKeyUp = true;	
	            break;
	        case KeyEvent.VK_LEFT:
	            // handle left
	        	isKeyLeft = true;	        	
	            break;
	        case KeyEvent.VK_RIGHT:
	            // handle right
	        	isKeyRight = true;	        	
	            break;
	       // default:
	        //	isAnotherKey = true;
	     }
	}
	
	public void keyReleased(KeyEvent e) 
	{
		int keyCode = e.getKeyCode();
	    switch( keyCode ) 
	    { 
	        case KeyEvent.VK_UP:
	            // handle up
	        	isKeyUp = false;	        	
	            break;
	        case KeyEvent.VK_LEFT:
	            // handle left
	        	isKeyLeft = false;	        	
	            break;
	        case KeyEvent.VK_RIGHT:
	            // handle right
	        	isKeyRight = false;	        	
	            break;
	      //  default:
	        //	isAnotherKey = false;
	     }
		
	}
	
	public void keyTyped(KeyEvent e) 
	{
		
	}
	
	public void paint(Graphics brush)
	{
   		brush.fillPolygon(getXCo(getPoints()),getYCo(getPoints()),getPoints().length);
   		if(!Asteroids.gameOver){
   		if (isKeyUp)
   		{
   			timer = 30;
   		}
   		else
   		{
   			timer--;
   		}
   		  
   		if (timer > 0) 
   		{
			brush.drawString("You are holding Up",100,100);
			position.x += Asteroids.moveSpeed * Math.cos(Math.toRadians(rotation));
			position.y += Asteroids.moveSpeed * Math.sin(Math.toRadians(rotation));
		}
		if (isKeyLeft) 
		{
			brush.drawString("You are holding Left",100,200);
			rotation -= Asteroids.moveSpeed;
		}
		if (isKeyRight) 
		{
			brush.drawString("You are holding Right",100,300);
			rotation += Asteroids.moveSpeed;
		}
		
		if(position.x > screenWidth + 10)
		{
			position.x = 0;
		}
		
		if(position.x < -10)
		{
			position.x = screenWidth;
		}


		if(position.y > screenHeight + 10)
		{
			position.y = 0;
		}
		
		if(position.y < -10)
		{
			position.y = screenHeight;
		}
		
   		}
	}


}
