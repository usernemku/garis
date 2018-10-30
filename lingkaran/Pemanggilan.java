import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pemanggilan extends JPanel{
   
    public void paintComponent(Graphics g){
        
        lingkaran baru = new lingkaran();
        g.setColor(Color.BLACK); 
        baru.bunder(g, 100, 150, 50);

            }
    
    public static void main(String[] args) {
        lingkaran baru = new lingkaran();
        JFrame frame = new JFrame("lingkaran");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Pemanggilan());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(baru);
    }
}