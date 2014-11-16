package cs2s03;

import java.util.ArrayList;

public class StackChar implements MyStack {

	// Initialize the private array list
	private ArrayList<Character> array;
	
	//  
	StackChar (){
		// create a new empty arraylist
		array = new ArrayList<Character>();
	}
	StackChar (char c){
		//create teh new array with a char in it
		array = new ArrayList<Character>();
		this.push(c);
	}
	@Override
	public char top() throws EmptyContainerException {
		// return the top item
		return array.get(0);
	}

	@Override
	public void pop() {
		// pop the top off
		// remove the 0 index element
		array.remove(0);
	}

	@Override
	public void push(char c) {
		// Add the item c to the top (index 0)
		array.add(0, c);
	}

	@Override
	public boolean isEmpty() {
		// If the array is empty or it is null it is empty
		if (array == null || array.isEmpty())
			return true;
		else
			return false;
	}
	
	@Override
	public boolean equals (Object obj){
		// compare the string versions of the lists to see if they are equal
		if (this.toString().equals(obj.toString())) 
			return true;
		else
			return false;
	}
	
	public String toString(){
		// create a string variable
		String ret = "";
		// iterate through the list and append the items to the string variable
		for (char i : array){
			ret += i + " ";
		}
		// return the string list
		return ret;
	}
}
