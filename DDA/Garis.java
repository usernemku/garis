import java.awt.Graphics;

public class Garis {

    public void garisDDA(Graphics g, int x1, int y1, int x2, int y2) {
        int dx, dy, steps;
        float x_tambah, y_tambah, x=x1, y=y1;
		if(x2>x1){
        dx = x2 - x1;
        dy = y2 - y1;
		}
		else
		{
			dx=x1-x2;
			dy=y1-y2;
		}
        if (Math.abs(dx) > Math.abs(dy)) {
            steps = Math.abs(dx);
        } else {
            steps = Math.abs(dy);
        }
        x_tambah = dx / (float)steps;
        y_tambah = dy / (float)steps;
        x = x1;
        y = y1;

        g.drawRect(Math.round(x), Math.round(y), 1, 1);
        for (int k = 0; k < steps; k++) {
            x += x_tambah;
            y += y_tambah;

            g.drawRect(Math.round(x), Math.round(y), 1, 1);
        }

    }
}