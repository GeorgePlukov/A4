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
		if (this.c == '\0'){
			return true;
		}else 
			return false;
	}
	public String toString() {
		if (this.l == null) {
			return this.c + "";
		}
		return this.l + " " + this.c;
	}
	
	public static void main(String[] args) {
		SnocList a = new SnocList();
		System.out.println(a.isEmpty());
	}
}
