package cs2s03; 
public class SnocList {
	// Initialize the "tail" in this case the tail comes before the head
	private SnocList tail;
	// Initialize the character that will hold the actual information
	private char head;
	SnocList(char c, SnocList l) {
		this.tail = l;
		this.head = c;
	}
	public char peek () throws EmptyContainerException{
		if (this.head == '\0')
			throw new EmptyContainerException("This listchar is empty duuuudee");
		else
			return this.head;	}
	public void pop (){
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
	public void push(char c) {
		if (this.head =='\0' && this.tail == null){
			this.head = c;
			this.tail = null;
		}else{
			// make the current tail equal to a new list that is essentially the
			// current list
			this.tail = new SnocList(this.head, this.tail);
			// add the new head to this list
			this.head = c;
		}
	}
	public boolean isEmpty(){
		if (this.head == '\0' && this.tail == null)// Even in a snoc list if the char is null and the list is null then the whole list is empty!
			return true;
		return false;
	}
	@Override
	public boolean equals(Object obj){
		if (this.toString().equals(obj.toString()))
			return true;
		return false;
	}
	@Override
	public String toString() {
		return this.tail + "" + this.head;
	}
}
