import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {
	public FlickeringLabel(String text) {
		super(text);
		setOpaque(true);

		Thread th = new Thread(this);
		th.start();
	}

	public void run() {
		int n = 0;
		while (true) {
			if (n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if (n == 0)
				n = 1;
			else
				n = 0;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				return;
			}

		}
	}

	class FlickeringLabel2 extends JLabel implements Runnable {
		public FlickeringLabel2(String text) {
			super(text);
			setOpaque(true);

			Thread th2 = new Thread(this);
			th2.start();
		}
		public void run2() {
			int n = 0;
			while (true) {
				if (n == 0)
					setBackground(Color.RED);
				else
					setBackground(Color.PINK);
				if (n == 0)
					n = 1;
				else
					n = 0;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					return;
				}

			}
		}

	}

public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx(){
		setTitle("FlickeringLabelEx ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("±ô¹Ú");
		
		FlickeringLabel2 label = new FlickeringLabel2("¾È±ô¹Ú");
		
		FlickeringLabel fLabel2 = new FlickeringLabel("¿©±âµµ ±ô¹Ú");
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}
