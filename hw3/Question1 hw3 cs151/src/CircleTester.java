import java.awt.*;
import javax.swing.*;

public class CircleTester {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		
		CircleShape Circle = new CircleShape(50);
		JLabel label = new JLabel(Circle);
		label.setPreferredSize(new Dimension(150, 150));
		

		JButton red = new JButton("Red");
		red.addActionListener(event -> {
			Circle.setColor(Color.red);
			label.repaint();
		});

		JButton green = new JButton("Green");
		green.addActionListener(event -> {
			Circle.setColor(Color.green);
			label.repaint();
		});
		
		JButton blue = new JButton("Blue");
		blue.addActionListener(event -> {
			Circle.setColor(Color.blue);
			label.repaint();
		});
		


		
		frame.setLayout(new FlowLayout());
		frame.add(label);
		frame.add(red);
		frame.add(green);
		frame.add(blue);
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}