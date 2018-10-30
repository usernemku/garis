import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanggilGaris extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        
        Garis baru = new Garis();
        g.setColor(Color.BLACK); 
        baru.garisBresenham(g, 10, 20, 100, 60);

            }
    
    public static void main(String[] args) {
        Garis baru = new Garis();
        JFrame frame = new JFrame("DDA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PanggilGaris());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
               
    }
}