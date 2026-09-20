package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	
	
	Popcorn pop = new Popcorn(JOptionPane.showInputDialog("what flavor of popcorn u want"));
	Microwave micro = new Microwave();
	micro.setTime(Integer.parseInt(JOptionPane.showInputDialog("how long do you wanna set it for in minutes")));
	micro.putInMicrowave(pop);
	micro.startMicrowave();
}
}
