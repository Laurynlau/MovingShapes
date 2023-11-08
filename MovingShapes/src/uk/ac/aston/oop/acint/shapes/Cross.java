package uk.ac.aston.oop.acint.shapes;

import uk.ac.aston.oop.acint.util.GraphicsContextWrapper;

public class Cross implements Drawable {

	protected static final int SIZE = 20;
	
	double centerX;
	double centerY;
	
	public Cross (double cX, double cY) {
		centerX = cX;
		centerY = cY;
		
	}

	
	public void draw(GraphicsContextWrapper gcw) {
		gcw.line(centerX - SIZE/2, centerY - SIZE/2, centerX + SIZE/2, centerY+ SIZE/2);
		gcw.line(centerX + SIZE/2, centerY - SIZE/2,centerX - SIZE/2, centerY+ SIZE/2);
		
	}
	
	public void move(GraphicsContextWrapper gc, double dx, double dy) {
		
		
		centerX += dx;
		centerY += dy;

		if (centerX + SIZE/2 > gc.width()) {

			centerX = gc.width() - SIZE/2;
		}

		if (centerY + SIZE/2 > gc.height()) {

			centerY= gc.height() - SIZE/2;
		}

	}
}
