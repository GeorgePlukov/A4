package cs2s03;

public class AListPQueue implements MyPriorityQueue {

	private AList l;
	
	AListPQueue(){
		l = null;
	}
	
	@Override
	public char next() throws EmptyContainerException {
		return this.l.getHead();
	}

	@Override
	public void deleteItem() {
		//  Take all of the items of the tail of AList and put them in a new list
		// since the list is stored in priority order doing this will take out the highest priority element
		AList lTail = l.getTail();
		l = new AList (lTail.getHead(),lTail.getPriority(),lTail.getTail());
	}

	@Override
	public void insertItem(int p, char c) {
		if (l == null){
			l = new AList (c,p,l);
		}
		if (l.getPriority() < p){
			// insert it at the top
			// This list is the new item at the beggining and then the old list
			l = new AList (c,p,l);
		} else if (l.getPriority() == p){
			// do the alphebetical order
		}
	}

	@Override
	public boolean isEmpty() {
		if (l == null || (l.getHead() == '\0' && l.getTail() == null))
			return true;
		else 
			return false;
	}
	
	@Override
	public boolean equals(Object obj){
		if (l.toString().equals(obj.toString()))
			return true;
		else
			return false;
		
	}
	
	@Override
	public String toString (){
		return l.toString();
	}
	public static void main(String []args){
		AListPQueue a = new AListPQueue();
		a.insertItem(3, 'a');
		a.insertItem(8, 'd');
		AListPQueue b = new AListPQueue();
		System.out.println(a);
	}
}
