package game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import launcher.Assets;
import launcher.Handler;
import launcher.Tiles;

public class Monster1 extends MovingEntity{

	
	Random rand = new Random();
	



	public Monster1 (Handler handler, float x, float y) {
		super(handler, x, y, 120 ,100);
	    	
		    damage = 400;
		    currenthealth = 500;
		    bounds.x = 20;	
	    	bounds.y = 20;
	    	bounds.height = 120;
	    	bounds.width = 100;
	    
		
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
 
	if( Math.sqrt( Math.pow((this.x - handler.getGame().Playershot.x),2) + Math.pow((this.y - handler.getGame().Playershot.y),2)) <= 1 ) {
		
		
		this.currenthealth -= handler.getGame().friendly.damage ;
		
		
	}
	
		
	
   if(Math.sqrt( Math.pow((this.x - handler.getGame().Playershot.x),2) + Math.pow((this.y - handler.getGame().Playershot.y),2)) <= 1 ) {
		
		
		this.currenthealth -= handler.getGame().player.damage ;
		
   
	if(this.currenthealth <= 0) {
		
		handler.getWorlds().getEntityManager().getEntities().remove(this);
	}


   }
}


}
	

		
	



	
	



	 

	 
	
	 
	 



public void render(Graphics g) {
	
g.drawImage(Assets.Monster1,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

	}
		
		
	}



