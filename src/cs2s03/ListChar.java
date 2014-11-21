package cs2s03;

public class ListChar implements MyStack {

	private char head;
	private ListChar tail;
	ListChar(char head, ListChar tail) {
		this.head = head;
		this.tail = tail;
	}
	@Override
	public char top() throws EmptyContainerException {
		if (this.head == '\0')
			throw new EmptyContainerException("This listchar is empty duuuudee");
		else
			return this.head;
	}
	// pop an item off the top of the stack
	public void pop() {
		// make current head into the head of the tail
		if (!(this.head == '\0') && this.tail != null)		{
			this.head = this.tail.head;
			// make current tail into the tail of the current tail
			this.tail = this.tail.tail;
		}else{
			this.head = '\0';
			this.tail = null;
		}
	}
	// push an item onto the stack
	public void push(char c) {
		if (this.head =='\0' && this.tail == null){
			this.head = c;
			this.tail = null;
		}else{
			// make the current tail equal to a new list that is essentially the
			// current list
			this.tail = new ListChar(this.head, this.tail);
			// add the new head to this list
			this.head = c;
		}
	}
	@Override
	public boolean isEmpty() {
		// check to see if the head and tail are null
		if (head == '\0' && tail == null) 
			return true;
		return false;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.toString().equals(obj.toString()))
			return true;
		return false;
	}
	public String toString() {
		return head + "" + tail;
	}

}
