import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1 + 3, y1 + 3, width - 6, height - 6);
                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.RED);
//                        g.drawLine(x2, y1, x1, y2);
                        
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(getWidth() / 2 - 27, getHeight() / 2 - 27, 55, 55);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.drawPolygon(p2);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(0, 29, 230, 29);
                        g.setColor(Color.WHITE);
                        g.fillRect(0, 87, 230, 29);
                        
                        g.setColor(Color.BLUE);
                        Polygon p3 = new Polygon();
                        p3.addPoint(0, 0);
                        p3.addPoint(125, 73);
                        p3.addPoint(0, 145);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
//                        
//                        Polygon p4 = new Polygon();
//                        p4.addPoint(32, 39);
//                        p4.addPoint(x, y);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 15, y1 + 67);
                        p2.addPoint(x1 + 31, y1 + 67);
                        p2.addPoint(x1 + 37, y1 + 52);
                        p2.addPoint(x1 + 43, y1 + 67);
                        p2.addPoint(x1 + 59, y1 + 67);
                        p2.addPoint(x1 + 46, y1 + 77);
                        p2.addPoint(x1 + 51, y1 + 92);
                        p2.addPoint(x1 + 37, y1 + 82);
                        p2.addPoint(x1 + 24, y1 + 92);
                        p2.addPoint(x1 + 28, y1 + 77);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);     
            }
}