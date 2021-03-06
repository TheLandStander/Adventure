package launcher;
import launcher.Handler;
import java.awt.Graphics;
import javax.swing.JLabel;

import game.Creature;
import game.Game;

import game.Player;


public class GameState extends State{

    private Worlds Worlds;
    private Handler handler;
    Window window;
   
	
	public GameState(Handler handler) {
		super(handler);
		
	Worlds = new Worlds(handler,"res/worlds/world1.txt");
	
	   handler.setWorlds(Worlds);
	   
	   

	   handler.getCamera().move(100,200);
		
	}
	
	
	
	public void tick() {
		
		Worlds.tick();
		
	
		  
	}
 
	public void render(Graphics g) {
	    Worlds.render(g);
	   
	
	}

}
