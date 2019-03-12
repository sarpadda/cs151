import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class CircleShape implements Icon{
	private int width;
	private Color color;
	
	public CircleShape(int width) {
		width = width;
		color = Color.red;
	}
	
	public int getIconWidth() {
		return width;
	}
	
	public int getIconHeight() {
		return width / 2;
	}

	public void setColor(Color newColor) {
		color = newColor;
	}
	
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(10, 2, 60, 60);
		g2.setPaint(color);
		g2.fill(circle);
	}

	
}