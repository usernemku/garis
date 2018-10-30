
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class lingkaran extends JPanel {

    public void bunder(Graphics g,int xc,int yc, int r) {     
        int p =  1-r;
        int x = 0;
        int y = r;

        super.paint(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.BLACK);

        while(x<=y) {
            x++;
            if (p<0) {
               p+=2*x+1;
            } else {
                y--;
                p+=2*(x-y)+1;
            }
            
            g.drawRect(xc+x, yc+y, 1, 1);
            g.drawRect(xc-x, yc+y, 1, 1);
            g.drawRect(xc+x, yc-y, 1, 1);
            g.drawRect(xc-x, yc-y, 1, 1);
            g.drawRect(xc+y, yc+x, 1, 1);
            g.drawRect(xc-y, yc+x, 1, 1);
            g.drawRect(xc+y, yc-x, 1, 1);
            g.drawRect(xc-y, yc-x, 1, 1);
        }
        
    }
}
