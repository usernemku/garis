import java.awt.Graphics;

public class Garis {

    public void garisBresenham(Graphics g, int x1, int y1, int x2, int y2) {
        int p,x,y,xend;
        int dx =Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int duady = 2*dy;
        int duadydx = 2*(dy-dx);
		if(x1>x2){
        x=x2;
        y=y2;
        xend=x1;
		}
		else
		{
			x=x1;
            y=y1;
            xend=x2;
		}

        p=2*dy-dx;

        g.drawRect(x, y, 1, 1);
        while(x<xend) {
            x++;
            if(p<0) {
                p+=duady;
            } else {
                if (y1>y2) {
                    y--; } else y++;
                p+=duadydx;
            }
            g.drawRect(x, y, 1, 1);
       
        }

    }
}