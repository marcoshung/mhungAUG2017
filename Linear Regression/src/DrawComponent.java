import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.awt.geom.Ellipse2D;
public class DrawComponent extends JComponent{
	List list = Console.getList();

	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) (g);
		g2.drawLine(0,(int) list.getB(),1000,(int) (list.getB() + (1000 * list.getA())));
		
		for(DataPoint data: list.getDataPoints()) {
			Ellipse2D.Double point = new Ellipse2D.Double(data.getX(),data.getY(),10,10);
			g2.draw(point);
			g2.fill(point);
		}
	}
}