import java.awt.Color;

/**
 * 
 * This class is set pillar and make it change it's color.
 * @author Benyapa Suesattabongkot
 *
 */

public class Pillar extends Piece {

	/**
	 * 
	 * @param x position x of walker.
	 * @param y position y of walker.
	 * @param c to check condition.
	 * @param m is map that add walker and other piece.
	 * 
	 */
	public Pillar(int x, int y, int c, Map m) {
		super(Piece.PILLAR, m);

		this.setX(x);
		this.setY(y);

		if (c == 0) { this.setColor(Color.RED); }
		else if (c == 1) { this.setColor(Color.GREEN); }
		else if (c == 2) { this.setColor(Color.YELLOW); }
	}

	/**
	 * Same as constructor below but change integer to color.
	 * @param x
	 * @param y
	 * @param c
	 * @param m
	 */
	public Pillar(int x, int y, Color c, Map m) {
		super(Piece.PILLAR, m);

		this.setX(x);
		this.setY(y);

		if (c.equals(Color.RED) || c.equals(Color.GREEN) || c.equals(Color.YELLOW)) { this.setColor(c); }
	}

	/**
	 * This method is make pillar change it color.
	 */
	@Override
	public void act() {
		int random = Piece.rand(0, 2);
		int color = Piece.rand(0, 2);

		if (random == 0) {
			if (color == 0) { this.setColor(Color.YELLOW); }
			else if (color == 1) { this.setColor(Color.GREEN); }
			else { this.setColor(Color.RED); }
		}

	}

	public String toString() {
		return getColorWord() + " Pillar at (" + getX() + ", " + getY() + ")";
	}

}
