import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GraphicsFillEx extends JFrame {
	Container contentPane;
	JCheckBox[] e = new JCheckBox[5];
	int w;
	GraphicsFillEx() {
		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(100, 350);
		setVisible(true);
		
	}

}

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(10, 10, 50, 50);
		g.setColor(Color.BLUE);
		g.fillRect(10, 70, 50, 50);
		g.setColor(Color.GREEN);
		g.fillRoundRect(10, 130, 50, 50, 20, 20);
		g.setColor(Color.MAGENTA);
		g.fillArc(10, 190, 50, 50, 0, 270);
		g.setColor(Color.ORANGE);
		int[] x = { 30, 10, 30, 60 };
		int[] y = { 250, 275, 300, 275 };
		g.fillPolygon(x, y, 4);
	}

	abstract class MyItemListener implements ItemListener {
		public void itmeStateChanged(ItemEvent e){
				JCheckBox
				int selected = 1;
						
						if(e.getStateChange() == ItemEvent.SELECTED)
							selected = 1;
						else
							selected = -1;
						
						if(e.getItem() == e[0])
							
						
			}
	}

	public static void main(String[] args) {
		new GraphicsFillEx();
	}
}