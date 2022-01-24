package src.nico.space;

import java.util.ArrayList;

import src.nico.space.elements.Alien;
import src.nico.space.elements.AlienShip;
import src.nico.space.elements.Player;
import src.nico.space.elements.Projectile;
import src.nico.space.elements.Shield;

import src.nico.space.utils.MapGenerator;
import src.nico.space.utils.ResourceManager;

public class Reference {
	
	public static final int windowWidth = 900;
	public static final int windowHeight = 600;
	
	public static Player player;
	public static Alien aliens[][];
	public static MapGenerator map;
	public static ArrayList<Projectile> projectiles;
	public static Shield shields[];
	public static AlienShip redShip;
	
	public static final int alienRows = 5;
	public static final int alienColumns = 11;
	
	public static int[] highscores = ResourceManager.readHighscores();
}
