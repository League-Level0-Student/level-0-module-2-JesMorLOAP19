//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	private static final Object Maybe = null;

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int number=new Random( ).nextInt(4);
	// 3. Print out this variable
JOptionPane.showMessageDialog(null,"new Random().nextInt(4)");
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog(null,"do i have a dog");
// 5. If the random number is 0
if(number==0)}
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null,"yes");
	// 6. If the random number is 1
if ("number==1){
	// -- tell the user "No"
JOptionPane.showMessageDialog(null,"no");
	// 7. If the random number is 2
if ("random number is 2" != null);{
	// -- tell the user "Maybe you should ask Google?"
JOptionPane.showMessageDialog(null,"Maybe you should ask Google");
	// 8. If the random number is 3
if ("random number is 3" != null);{
	// -- write your own answer
JOptionPane.showMessageDialog(null,"Maybe you should ask Safari");
}

	
		//
		
	}
}