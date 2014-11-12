package cs2s03;

public class SnocList {
	private SnocList l;
	private char c;

	SnocList(char c, SnocList l) {
		this.l = l;
		this.c = c;
	}

	public String toString() {
		if (this.l == null) {
			return this.c + "";
		}
		return this.l + " " + this.c;
	}
	
	public static void main(String[] args) {
		System.out.println(new SnocList('a', new SnocList('b', new SnocList('3', null))));
	}
}
