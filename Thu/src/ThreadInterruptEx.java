import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.ThreadLocalRandom;

class TimerRunnable implements Runnable{
	JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel){
		this.timerLabel = timerLabel;
	}
	public void run(){
		int n =0;
		while(true){
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
				// TODO: handle exception
			}
		}
	}
}
public class ThreadInterruptEx extends JFrame{
	Thread th;
	
	public ThreadInterruptEx(){
		setTitle("hreadInterruptEx ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable);
		c.add(timerLabel);
		
		JButton btn = new JButton("Kill Timer");
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				th.interrupt();
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);
			}
		});
		c.add(btn);
		setSize(300,150);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}
}