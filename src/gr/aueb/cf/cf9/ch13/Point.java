package gr.aueb.cf.cf9.ch13;

import java.util.Random;

public class Point {
	private int x;
	private  int y;

	public Point(){

	}

	public Point(int y, int x) {
		this.y = y;
		this.x = x;
	}

	/**
	 * Static factory method.
	 * @return		new instance.
	 */
	public static Point getInstance(){
		return new Point();
	}

	public static Point getRandomPoint() {
		final int BOUND = 100;
		Random random = new Random(System.nanoTime());
		return new Point(random.nextInt(BOUND - 1 + 1) + 1, random.nextInt(BOUND -1 + 1) + 1 );
	}
}
