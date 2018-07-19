import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
import java.awt.geom.Ellipse2D;
public class DrawComponent extends JComponent{
	List list = Console.getList();
	int height = Console.getHeight();
	int width = Console.getWidth();
	private int SCALE_SIZE = 5;
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) (g);
		g2.drawLine(0,(int) (height - (list.getB()* SCALE_SIZE)), width * SCALE_SIZE,(int) (height - (list.getB() * SCALE_SIZE + (width * list.getA() *SCALE_SIZE))));
		
		for(DataPoint data: list.getDataPoints()) {
			Ellipse2D.Double point = new Ellipse2D.Double(data.getX() * SCALE_SIZE, (height - 10 - (SCALE_SIZE *data.getY())),10,10);
			g2.draw(point);
			g2.fill(point);
		}
	}
}