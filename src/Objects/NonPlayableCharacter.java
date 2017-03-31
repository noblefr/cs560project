package Objects;

import org.newdawn.slick.Image;
import org.newdawn.slick.SpriteSheet;

import Entities.ObjectEntity;
import Enums.ObjectType;

/**
 * All npcs should implement this class and also implement one of the interact
 * methods defined in ObjectEntity, depending on the level of complexity the 
 * action is.
 * 
 * @author Gregory
 *
 */

public class NonPlayableCharacter extends ObjectEntity {
	private String name;		  // Name of the npc to be displayed.
	private String[][] textPages; // Should use strings that are defined in 'MessageBundle*.properties'.
	private SpriteSheet ss;       // Spritesheet for the given NPC.
	private int xMax;
	private int yMax;
	
	/**
	 * Default constructor.
	 */
	public NonPlayableCharacter () {
		super();
		this.name = "";
		this.textPages = null;
		this.ss = null;
	}
	
	/**
	 * Use this method to define an NPC that has no text-based
	 * interactions. (Perhaps performs animations or runs away
	 * upon interaction).
	 * @param ss
	 */
	public NonPlayableCharacter (String name, SpriteSheet ss, int xpos, int ypos, 
								 int xMax, int yMax, int interactType) {
		super(xpos, ypos, ObjectType.NPC, "", interactType);
		this.name = name;
		this.textPages = null;
		this.ss = ss;
		if (this.ss != null) {
			this.img = this.ss.getSprite(0, 0);
			this.img1 = this.ss.getSprite(0, 1);
		}
	}
	
	/**
	 * Use to create an NPC with a name, speech, sprite sheet, and a position.
	 * @param name
	 * @param textPages
	 * @param ss
	 */
	public NonPlayableCharacter(String name, String[][] textPages, SpriteSheet ss,
								int xpos, int ypos, int xMax, int yMax, int interactType) {
		super(xpos, ypos, ObjectType.NPC, "", interactType);
		this.name = name;
		this.textPages = textPages;
		this.ss = ss;
		if (this.ss != null) {
			this.img = this.ss.getSprite(0, 0);
			this.img1 = this.ss.getSprite(0, 1);
		}
	}
	
	/**
	 * Use this constructor if only a single image will ever be needed and no text.
	 * @param name
	 * @param ss
	 */
	public NonPlayableCharacter (String name, Image img, int xpos, int ypos, int interactType) {
		super(xpos, ypos, ObjectType.NPC, "", interactType);
		this.name = name;
		this.textPages = null;
		this.img = img;
	}
	
	/**
	 * Use this constructor if only a single image will ever be needed.
	 * @param name
	 * @param ss
	 */
	public NonPlayableCharacter (String name, String[][] textPages, Image img, int xpos, int ypos, int interactType) {
		super(xpos, ypos, ObjectType.NPC, "", interactType);
		this.name = name;
		this.textPages = textPages;
		this.img = img;
	}

	/**
	 * Getters and setters for the sprite sheet.
	 * @return
	 */
	public SpriteSheet getSs() {
		return ss;
	}

	public void setSs(SpriteSheet ss) {
		this.ss = ss;
	}
	
	public int getxMax() {
		return xMax;
	}

	public int getyMax() {
		return yMax;
	}
}
