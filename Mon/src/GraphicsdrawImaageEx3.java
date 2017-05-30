import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsdrawImaageEx3 extends JFrame {
	Container contentPane;

	public GraphicsdrawImaageEx3() {
		setTitle("drawimage 사용예제3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("images/image0.jpg");
		Image img = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawImage(img, 100, 50, 200, 200, 20, 20, 250, 100, this);
		}
	}

	public static void main(String[] args) {
		new GraphicsdrawImaageEx3();
	}

}
