package bowling;


import java.util.LinkedList;
import java.util.List;

/**
*
*khaitq on 8 nov. 2017
*/

public class Bowling {

	public static final int FRAME_NUMBER = 10;

	private List<Frame> frames = new LinkedList<Frame>();
	
	private int score;
	
	public void pow(int point1, int point2) {
		
		frames.add(new Frame(point1, point2));
	}
	

	public int getScore() {
		
		for (int i = 0; i < frames.size(); i++) {
			
			Frame frame = frames.get(i);
			
			this.score += frame.getScore();
			
			if (frame.isSpake() && i < frames.size() - 1) {
				
				Frame nextFrame = frames.get(i+1);
				
				if (nextFrame != null) {
					
					this.score += nextFrame.getPoint1();
					
				}
				
			}
		}
		
		
		return score;
	}

}


