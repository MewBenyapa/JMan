import java.awt.Color;

/**
 * 
 * This class is set walker and condition that make walker walk.
 * @author Benyapa Suesattabongkot
 *
 */

public class Walker extends Piece {

	/**
	 * 
	 * @param x position x of walker.
	 * @param y position y of walker.
	 * @param c to check condition.
	 * @param m is map that add walker and other piece.
	 * 
	 */
	public Walker(int x, int y, int c, Map m) {
		super(Piece.WALKER, m);

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
	public Walker(int x, int y, Color c, Map m) {
		super(Piece.WALKER, m);

		this.setX(x);
		this.setY(y);

		if (c.equals(Color.RED) || c.equals(Color.GREEN) || c.equals(Color.YELLOW)) { this.setColor(c); }
	}

	/**
	 * This method is make walker can go up, down, left and right.
	 */
	@Override
	public void act() {
		int random = Piece.rand(0, 2);
		int walk = Piece.rand(0, 3);
		if (random == 0) {
			if (walk == 0 && this.getMap().isEmpty(this.getX(), this.getY() + 1)) { 
				this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY() + 1); 
			} else if (walk == 1 && this.getMap().isEmpty(this.getX(), this.getY() - 1)) { 
				this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY() - 1);
			} else if (walk == 2 && this.getMap().isEmpty(this.getX() - 1, this.getY())) { 
				this.getMap().move(this.getX(), this.getY(), this.getX() - 1, this.getY());
			} else if (walk == 3 && this.getMap().isEmpty(this.getX() + 1, this.getY())) { 
				this.getMap().move(this.getX(), this.getY(), this.getX() + 1, this.getY());
			}
		} 
	}

	public String toString() {
		return getColorWord() + " Walker at (" + getX() + ", " + getY() + ")";
	}
}
