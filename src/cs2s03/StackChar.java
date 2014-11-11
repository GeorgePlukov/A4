package cs2s03;

import java.util.ArrayList;

public class StackChar implements MyStack {

	private ArrayList<Character> array = null;
	@Override
	public char top() throws EmptyContainerException {
		return array.get(0);
	}

	@Override
	public void pop() {
		array.remove(0);
	}

	@Override
	public void push(char c) {
		array.add(0, c);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	public String toString(){
		String ret = "";
		for (char i : array){
			ret += i + " ";
		}
		return ret;
	}
	public static void main(String [] args){
		StackChar a = null;
		a.push('a');
		a.push('a');

		System.out.println(a);
	}
}
