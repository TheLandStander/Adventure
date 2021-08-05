package launcher;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;



public class Assets {

	
public static BufferedImage PlayerUp,PlayerDown,PlayerRight,PlayerLeft,PlayerShot,Friendly,Boss1,Monster1,Boss1Shot,Castle,House,Dark,Dirt,Fire,Lava,Water,Grass,Stone,Rock,Tree,Border;	


public static void init() {
	
	PlayerUp = Window.loadimage("/textures/player-up.png");
	PlayerDown = Window.loadimage("/textures/player-down.png");
	PlayerRight = Window.loadimage("/textures/player-right.png");
	PlayerLeft = Window.loadimage("/textures/player-left.png");
	PlayerShot = Window.loadimage("/textures/player-shot.png");
	 Boss1 = Window.loadimage("/textures/boss1.png");
	Boss1Shot = Window.loadimage("/textures/boss1-shot.png");
	 Monster1 = Window.loadimage("/textures/monster1.png");
	Friendly = Window.loadimage("/textures/friendly.png");
	Castle = Window.loadimage("/textures/castle.png");
	Grass = Window.loadimage("/textures/grass.png");
	Dirt = Window.loadimage("/textures/dirt.png");
	Lava = Window.loadimage("/textures/lava.png");
	House = Window.loadimage("/textures/house.png");
	Stone = Window.loadimage("/textures/stone.png");
	Water = Window.loadimage("/textures/water.png");
	Fire = Window.loadimage("/textures/fire.png");
	Rock = Window.loadimage("/textures/rock.png");
	 Dark = Window.loadimage("/textures/dark.png");
	 Tree = Window.loadimage("/textures/tree.png");
	 Border = Window.loadimage("/textures/border.png");
	
	
}






}
