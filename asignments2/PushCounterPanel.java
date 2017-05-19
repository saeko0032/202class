package test.file1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanel extends JPanel {
	private int count;
	private JButton push;
	private JLabel label;

	public PushCounterPanel() {
		count = 0;
		push = new JButton("Push me!");
		push.addActionListener(new ButtonListener());

		label = new JLabel("Push :" + count);

		add(push);
		add(label);

		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 400));

	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			count++;
			label.setText("Pushes: " + count);
		}

	}
}
