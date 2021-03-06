package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import launcher.Assets;
import launcher.GameOverState;
import launcher.Handler;
import launcher.State;
import launcher.Tiles;

public class Creature extends Entity{
	
	
	GameOverState Gameoverstate = new GameOverState(handler);
    
	
	
	public float getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	
	public static float getDefaultSpeed() {
		return DEFAULT_SPEED;
	}

	public static int getDefaultCreatureWidth() {
		return DEFAULT_CREATURE_WIDTH;
	}

	public static int getDefaultCreatureHeight() {
		return DEFAULT_CREATURE_HEIGHT;
	}

	protected int currenthealth;
	protected int maxhealth;
	protected int vitality;
	protected int defence;
	protected int damage;
	protected float speed;
	public float xMove, yMove;
	public static final int DEFAULT_SPEED = 3;
    public static final int DEFAULT_CREATURE_WIDTH = 64;
	public static final int DEFAULT_CREATURE_HEIGHT = 64;
	
	public Creature(Handler handler,float x, float y,int width,int height) {
		super(handler,x, y,width,height);
		
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
		
	}

	public void xMove() {
       //right
		if(xMove > 0) {
    	   
			int tx = (int) (x + xMove + bounds.x + bounds.width) / Tiles.TILEWIDTH;
			if(!collision (tx, (int) (y + bounds.y ) / Tiles.TILEHEIGHT) && 
					!collision(tx, (int)  (y + bounds.y + bounds.height) / Tiles.TILEHEIGHT)
					)
				x+= xMove;
    	   //left
       }
		else if (xMove <0){
    	   
			int tx = (int) (x + xMove + bounds.x) / Tiles.TILEWIDTH;
			if(!collision (tx, (int) (y + bounds.y ) / Tiles.TILEHEIGHT) && 
					!collision(tx, (int)  (y + bounds.y + bounds.height) / Tiles.TILEHEIGHT)
					)
				x+= xMove;
    	   
       }
         
         
	}
        
	public void yMove() {
		if (yMove < 0) {
			int ty = (int) (y + yMove + bounds.y) / Tiles.TILEHEIGHT;
			if (!collision((int) (x + bounds.x ) / Tiles.TILEWIDTH, ty) && 
			!collision((int) (x + bounds.x + bounds.width) / Tiles.TILEWIDTH, ty))
			y+= yMove;
		}
		
		else if(yMove > 0) {
			
			int ty = (int) (y + yMove + bounds.y + bounds.height) / Tiles.TILEHEIGHT;
			if (!collision((int) (x + bounds.x ) / Tiles.TILEWIDTH, ty) && 
			!collision ((int)(x + bounds.x + bounds.width) / Tiles.TILEWIDTH, ty))
			y+= yMove; 
			
		}
		
	}
	
	
	protected boolean collision(int x, int y) {
		return handler.getWorlds().getTiles(x,y).isSolid();
		
		
	}
	
public void move() {
	
	
	
		if(!CheckEntityCollisions(xMove, 0f) ) {
		xMove();}
		
		
		if(!CheckEntityCollisions(0f, yMove) ) {
		yMove();}
		
		
	
	
}
        
 

private float abs(int i) {
	
	return i;
}

public void tick() {

}


public void render(Graphics g) {

	
	
}
	
	
}
