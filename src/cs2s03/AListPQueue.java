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
		insert(l, p, c);
	
	}

	private void insert(AList l2, int p, char c) {
		// if the thing being put in has a higher priority put it at the front
		if (p > l.getPriority()){
			// insert it at the top
			// This list is the new item at the beginning and then the old list
			l = new AList (c,p,l);
		} else if (l.getPriority() == p){
			// do the alpha order order
		} else{
			if (l2.getTail() == null){
				
			}
			insert (l2.getTail(),p,c);
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
		a.insertItem(1, 'a');
		AListPQueue b = new AListPQueue();
		System.out.println(a);
	}
}
