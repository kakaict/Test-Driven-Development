package bowling;


/**
*
*khaitq on 8 nov. 2017
*/

public class Frame {

	private int point1;
	
	private int point2;
	
	public int getPoint1() {
		return point1;
	}

	public int getPoint2() {
		return point2;
	}

	public Frame(int point1, int point2) {
		this.point1 = point1;
		this.point2 = point2;
	}

	public int getScore() {

		return point1 + point2;
	}

	public boolean isSpake() {
		
		if (point1 + point2 == 10 && point2 > 0 && point2 <= 10) {
			return true;
		}
		return false;
	}
	
	

}


