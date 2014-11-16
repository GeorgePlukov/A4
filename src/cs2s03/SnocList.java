package cs2s03;

public class SnocList {
	// Initialize the "tail" in this case the tail comes before the head
	private SnocList l;
	
	// Initialize the character that will hold the actual information
	private char c;

	SnocList() {
		// creates the empty SnocList
		// this will have c and l = null 
	}
	SnocList(char c, SnocList l) {
		this.l = l;
		this.c = c;
	}
	
	public boolean isEmpty(){
		if (this.c == '\0' && this.l == null){ // Even in a snoc list if the char is null and the list is null then the whole list is empty!
			return true;
		}else 
			return false;
	}
	@Override
	public boolean equals(Object obj){
		if (this.toString().equals(obj.toString()))
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		if (this.l == null) {
			return this.c + "";
		}
		return this.l + " " + this.c;
	}

}
