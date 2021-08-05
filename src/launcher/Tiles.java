package launcher;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tiles {

public static Tiles[] Tiles = new Tiles[256];
	public static Tiles dirt = new Dirt (0);
	public static Tiles grass = new Grass (1);
	public static Tiles rock = new Rock (2);
	public static Tiles stone = new Stone (3);
	public static Tiles tree = new Tree (4);
	public static Tiles dark = new Dark (5);
	public static Tiles border = new Border (19);
	
public static final int TILEWIDTH = 64, TILEHEIGHT = 64;

	
	
protected BufferedImage texture;
protected final int id;
	
	public Tiles(BufferedImage texture,int id) {
		this.texture = texture;
		this.id = id;
		
		Tiles[id] = this;
	}
	
	public int getid(){
		return id;
	}
	
	public boolean isSolid() {
		
		return false;
		
	}
	
	public void tick(){
		
		
		
	}
	
	public void render(Graphics g, int x , int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
		
	}
	
	
}
