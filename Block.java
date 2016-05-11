import java.awt.Color;

/**
 * 
 * This class is set white block's constructor.
 * @author Benyapa Suesattabongkot
 *
 */

public class Block extends Piece {

	/**
	 * 
	 * 
	 * @param x position x of block. 
	 * @param y position y of block.
	 * @param m is map that add block and other piece.
	 */
	public Block(int x, int y, Map m) {
		super(Piece.BLOCK, m);

		this.setX(x);
		this.setY(y);
		this.setColor(Color.WHITE);

	}

	/**
	 * This method is not use.
	 */
	@Override
	public void act() {
		// TODO Auto-generated method stub
	}

	public String toString() {
		return getColorWord() + " Block at (" + getX() + ", " + getY() + ")";
	}

}
