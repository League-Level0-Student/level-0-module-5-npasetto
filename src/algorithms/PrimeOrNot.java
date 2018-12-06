package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	boolean prime=false;
	int factor=0;
	int number = Integer.parseInt(JOptionPane.showInputDialog("What number do you want to put in?"));
	for (int i = 2; i*i <= number; i++) {
		if(number%i==0) {
			prime=true;
			factor=i;
			break;
		}
	}
	if(prime==true) {
		System.out.println(number+" is divisible by "+factor);
	}else {
		System.out.println(number+" is prime.");
	}
}
}
