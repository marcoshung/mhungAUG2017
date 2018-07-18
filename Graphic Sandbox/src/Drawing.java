import javax.swing.JComponent;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D
;
public class Drawing extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) (g);
		Line2D.Double line = new Line2D.Double(0,50,100, 100);
		g2.draw(line);
		
			Ellipse2D.Double point = new Ellipse2D.Double(10, 10,10,10);
			g2.draw(point);
			g2.fill(point);
		
	}
}
