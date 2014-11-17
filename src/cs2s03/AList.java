package cs2s03;

public class AList{
	private char hd;
	private int priority;
	private AList tail;
	AList (final char a, final int b, final AList ll){
		this.hd = a;
		this.priority = b;
		this.tail = ll;
		
	}
	@Override
	public String toString(){
		String ret = "";
		if (this.hd == '\0' &&this.tail == null){
			ret += "null";
		}else
		// create and return the strings
			ret += this.hd + "" + this.priority + this.tail;
		return ret;
	}
	
	@Override
	public boolean equals (Object obj){
		// compare the two strings
		if (this.toString().equals(obj.toString()))
			return true;
		else
			return false;
	}
	public boolean isEmpty() {
		// check to see if the head and tail are null
		if (hd == '\0' && tail == null) 
			return true;
		else
			return false;
	}
	
	
	public AList getTail(){
		return this.tail;
	}
	public void setTail(AList tl){
		this.tail = tl;
	}
	public char getHead(){
		return this.hd;
	}
	public void setHead(char c){
		this.hd = c;
	}
	public void setPriority(int num){
		this.priority = num;
	}
	public int getPriority(){
		return this.priority;
	}

}
