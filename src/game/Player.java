package game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import launcher.Assets;
import launcher.Handler;
import launcher.State;


public class Player extends Creature{


	
	
	public Player(Handler handler, float x, float y) {
		super(handler,x, y, Creature.DEFAULT_CREATURE_WIDTH,Creature.DEFAULT_CREATURE_HEIGHT);
		
		
		maxhealth = 1000;
		currenthealth = maxhealth;
		vitality = 0;
		defence = 0;
		damage = 100;
		speed = 15.0f;
		bounds.x = 20;
	    bounds.y = 20;
	    bounds.height = 20;
	    bounds.width = 20;
		
		
	}
	
	public void tick() {
	getInput();
	move();
	handler.getCamera().centerOnEntity(this);	
	Checkplayer();
	

	//System.out.println(Math.pow((this.x - handler.getGame().monster1.x ), 4) + Math.pow((this.y - handler.getGame().monster1.y ), 4) + "monster");
	//System.out.println(Math.pow((this.x - handler.getGame().friendly.x), 2) + Math.pow((this.y - handler.getGame().friendly.y), 2) + "friendly");
	
	
	System.out.println("player x" + this.x);
	System.out.println("player y" + this.y);
	System.out.println("friendly x" + handler.getGame().friendly.x);
	System.out.println("friendly y" + handler.getGame().friendly.y);
	System.out.println("monster x" + handler.getGame().monster1.x);
	System.out.println("monster y" + handler.getGame().monster1.y);
	
	
	
	
	}
	
	
	
	public void Checkplayer(){

if(CheckEntityCollisions(bounds.x, bounds.y) ) {
   
	
	if( Math.sqrt( Math.pow((this.x - handler.getGame().friendly.x), 2) + Math.pow((this.y - handler.getGame().friendly.y ), 2)) <= 500) {
		
		
	
		
	}
		
	
	
	 if( Math.sqrt( Math.pow((this.x - handler.getGame().monster1.x), 2) + Math.pow((this.y - handler.getGame().monster1.y), 2)) <=100) {
		 
		 
	
		this.currenthealth -= handler.getGame().monster1.damage;
	}
	
		
	

	if(this.currenthealth <= 0) {
	
	
	State.setstate(Gameoverstate);
}
		
	}
	
	
	}
	
	
	private void getInput() {
		
		
	xMove = 0;
	yMove = 0;
	
	if (handler.getKeyManager().up)
	yMove= -speed;

	if (handler.getKeyManager().down)
		yMove = speed;
	
	if (handler.getKeyManager().right)
		xMove = speed;
	
	if (handler.getKeyManager().left)
		xMove = -speed;
	
	// Playershot DIRECTION 
	
	
	
	if (handler.getKeyManager().up && handler.getKeyManager().shoot) {
		handler.getWorlds().getEntityManager().addEntity(new Playershot(handler, this.x , this.y - 60));
		
	   
	
		
		yMove = 0;
	
	}
	
	

		if (handler.getKeyManager().down && handler.getKeyManager().shoot) {
			handler.getWorlds().getEntityManager().addEntity(new Playershot(handler, this.x  , this.y + 60 ) );
		
			yMove = 0;
		}
		
		
		
		
		if (handler.getKeyManager().right && handler.getKeyManager().shoot) {
			handler.getWorlds().getEntityManager().addEntity(new Playershot(handler, this.x + 60, this.y ));
		
			xMove = 0;
			
		}
		
		if (handler.getKeyManager().left && handler.getKeyManager().shoot) {
			handler.getWorlds().getEntityManager().addEntity(new Playershot(handler, this.x - 250 - 60 ,this.y ));
		
			
			xMove = 0;
		}
		
	
	
	}

	
	public void render(Graphics g) {
		
		if(handler.getKeyManager().down) {
			
			g.drawImage(Assets.PlayerDown,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

			
		}
		
		else if(handler.getKeyManager().up) {
			
			g.drawImage(Assets.PlayerUp,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

		}
		
		else if(handler.getKeyManager().right) {
			
			
			g.drawImage(Assets.PlayerRight,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

		}
		
		
		else if(handler.getKeyManager().left) {
			
			g.drawImage(Assets.PlayerLeft,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

			
		}
		
		else {
		
		g.drawImage(Assets.PlayerUp,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);

		}
	}

	
}
