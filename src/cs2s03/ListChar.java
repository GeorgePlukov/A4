package cs2s03;

public class ListChar implements MyStack {

	private char head;
	private ListChar tail;

	ListChar() {
		// creates the null list
	}

	ListChar(char head, ListChar tail) {
		this.head = head;
		this.tail = tail;
	}

	@Override
	public char top() throws EmptyContainerException {
		return this.head;
	}

	// pop an item off the top of the stack
	public void pop() {
		// make current head into the head of the tail
		this.head = this.tail.head;
		// make current tail into the tail of the current tail
		this.tail = this.tail.tail;
	}

	// push an item onto the stack
	public void push(char c) {
		// make the current tail equal to a new list that is essentially the
		// current list
		this.tail = new ListChar(this.head, this.tail);
		// add the new head to this list
		this.head = c;
	}

	@Override
	public boolean isEmpty() {
		// check to see if the head and tail are null
		if (head == '\0' && tail == null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean equals(Object compareObj) {
		if (compareObj == this) // comparing object to itself
			return true;
		if (!(compareObj instanceof ListChar)) // check to see if you are actually comparing two of the same type of objects
			return false;
		
		// Turn the the two objects into strings which will make thaem easier to compare		
		String list = this.head + " " + this.tail.toString();
		String objList = compareObj.toString();
		
		if (list.equals(objList))
			return true;
		else
			return false;
	}

	public String toString() {
		if (tail == null) {
			return head + " ";
		}
		return head + " " + tail;
	}

	public static void main(String[] args) {
		ListChar l1 = new ListChar('a', new ListChar('b', new ListChar('3',
				null)));
		ListChar l2 = new ListChar('a', new ListChar('b',new ListChar('3',
				null)));

		System.out.println(l1.equals(l2));
	}
}
