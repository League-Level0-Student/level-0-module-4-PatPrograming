package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	 // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet= JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 6; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy

			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task==0) {
	cuddle();
}
if (task==1) {
	food();
}
if (task==2) {
	water();
}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		if (happinessLevel>3) {
			JOptionPane.showMessageDialog(null, "You love your pet.");
			break;
		}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	
		
	static void cuddle() {
		JOptionPane.showMessageDialog(null, "The pet might bite when you cuddle.");
		happinessLevel++;
	}
	static void food() {
		JOptionPane.showMessageDialog(null, "The pet might eat the food when you feed it.");
		happinessLevel++;
	}
	static void water() {
		JOptionPane.showMessageDialog(null, "The pet might drink when you give it water.");
		happinessLevel++;
	}
	//    and INCREMENT the pet's happiness Level.
}