package cs2s03;

public class SnocQueue implements MyQueue{
	private SnocList l;

	SnocQueue(){
		
	}
	@Override
	public char peek() throws EmptyContainerException { // returns head does not change SnocList
		if (this.l == null || this.l.isEmpty() || this == null) // checks for a null snoc list or a empty snoclist
			throw new EmptyContainerException("Cannot peek, Snoc List is empty");
		else {
			return this.l.peek();
		}
	}

	@Override
	public void dequeue() {// Take an element off the top of the queue
		l.pop();
	}

	@Override
	public void enqueue(char c) { // add an element to the tail of the queue
		l.push(c);
	}

	@Override
	public boolean isEmpty() {
		if (this.l.isEmpty() || this.l == null)
			return true;
		else
			return false;
	}
	public static void main(String [] args){
		SnocQueue a = null;
		System.out.println(a);
	}
}
