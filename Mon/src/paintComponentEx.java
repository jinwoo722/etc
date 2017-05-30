import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class paintComponentEx extends JFrame {
	Container contentPane;

	paintComponentEx() {
		setTitle("paintComonent 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		MyButton b = new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.CYAN);
		contentPane.add(b);
		setSize(250, 200);
		setVisible(true);
		MyButton1 c = new MyButton1("new Button1");
		c.setOpaque(true);
		c.setBackground(Color.YELLOW);
		contentPane.add(c);
		setSize(250, 200);
		setVisible(true);

	}

	class MyButton extends JButton {
		MyButton(String s) {
			super(s);
		}

		public void paintComponenet(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth() - 1, this.getHeight() - 1);
		}
	}

	class MyButton1 extends JButton {
		MyButton1(String s) {
			super(s);
		}

		public void paintComponenet(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth() - 1, this.getHeight() - 1);
		}
	}

	public static void main(String[] args) {
		new paintComponentEx();
	}

}
