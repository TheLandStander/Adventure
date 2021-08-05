package game;

import java.awt.Graphics;

import launcher.Assets;
import launcher.Handler;

public class Playershot extends MovingEntity{
private int ShotTime = 0;


	
	public Playershot(Handler handler, float x, float y) {
		super(handler, x, y, 30, 30);
		
		
		
	}

	
	

	public void tick() {
		
		// show fast and what direction shot goes
		ShotTime++;
		
		x+= 50;
		
		
	if(handler.getKeyManager().up && handler.getKeyManager().shoot) {
		
		y -= 50;
		x-= 50;
		
		
	}
	
if(handler.getKeyManager().down && handler.getKeyManager().shoot) {
		
		
		y+=50;
		x-=50;
		
		
	}


		
		if(ShotTime == 5) {
			
	x += 0; y += 0;
				
	handler.getWorlds().getEntityManager().getEntities().remove(this);
	
	
	
		}
		
		
		if ( CheckEntityCollisions(bounds.x, bounds.y)  ) {
			
			handler.getWorlds().getEntityManager().getEntities().remove(this);
			
		}
		
		
		
		
	}
	
	
	
	public void render(Graphics g) {
		
		g.drawImage(Assets.PlayerShot,(int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), height, width, null);
		
		

			}
	
	
}
