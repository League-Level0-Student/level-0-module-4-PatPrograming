package _06_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String testScore=JOptionPane.showInputDialog("What was your test score?");
	int testS=Integer.parseInt(testScore);
	float testSS=Float.parseFloat(testScore);
	
	if (testSS>=80.0) {
		JOptionPane.showMessageDialog(null, "You must have studied really hard for that test!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Ur Kinda a Noob.");
	}
	
		
}
}
