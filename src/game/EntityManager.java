package game;

import java.awt.Graphics;
import java.util.ArrayList;

import launcher.Handler;

public class EntityManager {

private Handler handler;
private Player player;

private ArrayList<Entity> entities;


public void shot() {
	
}







	public EntityManager(Handler handler, Player player){
		this.player = player;
		this.handler = handler;
	  entities = new ArrayList<Entity>();
	  entities.add(player);
	  entities.add(new Friendly (handler, 350, 350));
	  entities.add(new Friendly (handler, 350, 350));
	  entities.add(new Friendly (handler, 350, 350));
	  entities.add(new Friendly (handler, 350, 350));
	  entities.add(new Friendly (handler, 350, 350));
	  entities.add(new Monster1 (handler, 950, 350));
	  entities.add(new Monster1 (handler, 950, 350));
	  entities.add(new Monster1 (handler, 950, 350));
	  entities.add(new Monster1 (handler, 950, 350));
	  
	  
		
	
	  
	  }
	

	






	public void tick() {
		
		for(int i = 0; i < entities.size(); i++) {
			
			Entity e = entities.get(i);
			e.tick();
			
			
			
		}
	
		
		
	
	}
	

public void render(Graphics g) {
	
	
	for (Entity e : entities) {
		
		e.render(g);
		
	}
	
	
}


public void addEntity(Entity e) {
	entities.add(e);
	
	
}


public Handler getHandler() {
	return handler;
}

public void setHandler(Handler handler) {
	this.handler = handler;
}

public Player getPlayer() {
	return player;
}

public void setPlayer(Player player) {
	this.player = player;
}


public ArrayList<Entity> getEntities() {
	return entities;
}

public void setEntities(ArrayList<Entity> entities) {
	this.entities = entities;
}




}

