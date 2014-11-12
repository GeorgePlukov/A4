package cs2s03;

public class SnocList {
	private SnocList l;
	private char c;
	
	SnocList(char c, SnocList l){
		this.l = l;
		this.c = c;
	}
	public String toString(){
		return getStr(this.l);
	}
	private String getStr(SnocList l) {
		if (l != null){
			return getStr(this.l) + this.c;
		}
		return "";
	}
	public static void main(String [] args){
		System.out.println(new SnocList('a', new SnocList('b',new SnocList ('3',null))));
	}
}
