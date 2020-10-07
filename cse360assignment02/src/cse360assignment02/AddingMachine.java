package cse360assignment02;

public class AddingMachine{
	int total;
	StringBuffer history;

	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = new StringBuffer("0");
	}

	//The getTotal method should return the current total
	public int getTotal () {
		return total;
	}

	//The add method should add the parameter to the total variable
	public void add (int value) {
		total = total + value;
		System.out.print(" + " + value);
	}

	//The subtract method should subtract the parameter from the total variable
	public void subtract (int value) {
		total = total - value;
		System.out.print(" - " + value);
	}

	public String toString () {
		return history.toString();
		// return "";
	}

	public void clear() {
	}
	
}