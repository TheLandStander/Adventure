package game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import launcher.Assets;
import launcher.Handler;
import launcher.State;
import launcher.Tiles;

public class Friendly extends MovingEntity{
	
	
	Random rand = new Random();
	



	public Friendly (Handler handler, float x, float y) {
		super(handler, x, y, 64 ,64);
	       damage = 30;
		   currenthealth = 50;
		    bounds.x = 20;	
	    	bounds.y = 20;
	    	bounds.height = 20;
	    	bounds.width = 20;
	     
		
	}
	
	
	
	 public void tick(){
		
		

		 int direction = rand.nextInt(4)  ;
		 
		 
		 if(handler.getGame().getTime() % 5 == 4) {
		 if (direction == 0) {   // UP
		    y -= 70;
		 }
		 
		 
		 }
		 
		 if(handler.getGame().getTime() % 5 == 4) {
		  if (direction == 1) { // DOWN
		    y += 70;
		 }
		 }
		 
		 
		 if(handler.getGame().getTime() % 5 == 4 ) {
		  if (direction == 2) { // left
			    x -= 70;
			 }
		 }
		 
		 if(handler.getGame().getTime() % 5 == 4) {
		  if (direction == 3) { // right
			    x += 70;
			 }
	 }
		 
		 
		 
		 if (x >= 1900 && x<= 5000) {
			 
			x -= 70;
			 
			 
		 }
		
		 
		 if (x <= 30 && x>= -5000) {
			 
			x += 70;
			 
		 }
		 
		 
		 if (y >= 1900 && y<= 5000) {
			 
			y -= 70;
			 
			 
		 }
		
		 
		 if (y <= 30 && y>= -5000) {
			 
			y += 70;
			 
			 
		 }
			 
		 



if(CheckEntityCollisions(bounds.x , bounds.y )) {
	
	

if( Math.sqrt( Math.pow((this.x - handler.getGame().monster1.x), 2) + Math.pow((this.y - handler.getGame().monster1.y), 2)) <= 1) {
		
		currenthealth -= handler.getGame().monster1.damage;
		
	
	}
	


	if(currenthealth <= 0) {
	handler.getWorlds().getEntityManager().getEntities().remove(this);}
}

	 
	 }
	 
	
	 
	 



public void render(Graphics g) {
	
g.drawImage(Assets.Friendly,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

	}
		
		
	}



