import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsDrawImageEx2 extends JFrame {
	Container contentPane;

	public GraphicsDrawImageEx2() {
		setTitle("drawimage ��뿹��2");
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

			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx2();
	}

}
