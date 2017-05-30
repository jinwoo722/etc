import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	JLabel timerLabel;
	JLabel timerLabel2;

	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		int n = 0;

		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}

class TimerThread2 extends Thread {
	JLabel timerLabel;
	JLabel timerLabel2;

	public TimerThread2(JLabel timerLabel2) {
		this.timerLabel2 = timerLabel2;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		int n = 0;

		while (true) {
			timerLabel2.setText(Integer.toString(n));
			n++;
			n %= 100;
			try {
				Thread.sleep(9);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}

public class RunnabelTimerEx extends JFrame {
	public RunnabelTimerEx() {
		setTitle("ThreadTimerEx ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		JLabel timerLabel2 = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 90));
		timerLabel2.setFont(new Font("Gothic", Font.ITALIC, 60));

		TimerThread th = new TimerThread(timerLabel);
		TimerThread2 th2 = new TimerThread2(timerLabel2);
		c.add(timerLabel);
		c.add(timerLabel2);

		setSize(300, 150);
		setVisible(true);

		th.start();
		th2.start();
	}

	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
