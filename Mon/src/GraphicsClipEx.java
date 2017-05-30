import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsClipEx extends JFrame {
	Container contentPane;
	JLabel la = new JLabel();
	final int FLYING_UNIT = 10;

	public GraphicsClipEx() {
		setTitle("image move check");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.setLayout(null);
		la.setSize(100, 20);
		contentPane.add(la);
		setSize(300, 400);
		setVisible(true);
		contentPane.requestFocus();
	}

	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("images/image0.jpg");
		Image img = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(100, 20, 150, 150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

		}

		class MyKeyListener extends KeyAdapter {
			public void keyPressed(KeyEvent e) {
				int a = e.getKeyCode();

				switch (a) {
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
					break;

				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
					break;

				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX() - FLYING_UNIT, la.getY());
					break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX() + FLYING_UNIT, la.getY());
					break;
				}

			}

		}
	}

	public static void main(String[] args) {
		new GraphicsClipEx();
	}

}

/**
 * case KeyEvent.VK_UP: if (la.getY() <= 0) return; else
 * la.setLocation(la.getX(), la.getY() - FLYING_UNIT); break;
 * 
 * case KeyEvent.VK_DOWN: if (la.getY() + la.getHeight() + FLYING_UNIT >
 * panel.getHeight()) return; else la.setLocation(la.getX(), la.getY() +
 * FLYING_UNIT); break;
 * 
 * case KeyEvent.VK_LEFT: if (la.getX() <= 0) return; else
 * la.setLocation(la.getX() - FLYING_UNIT, la.getY()); break;
 * 
 * case KeyEvent.VK_RIGHT: if (la.getX() + la.getWidth() + FLYING_UNIT >
 * panel.getWidth()) return; else la.setLocation(la.getX() + FLYING_UNIT,
 * la.getY()); break;
 */