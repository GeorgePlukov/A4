package cs2s03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestingA4 {

	static private ListChar lc;
	static private StackChar sc;
	static private SnocList sl;
	@Before
	public void setUp() {
		// this will create a new instance of each item every time a
		// class is called so that we are working with a fresh list/stack/queue
		lc = new ListChar('a', new ListChar('4', null));
		sc = new StackChar('4');
		sl = new SnocList ('d', new SnocList('a',null));
	}

	@Test
	public void testListChar1() throws EmptyContainerException {
		// Test 1: pop
		lc.pop();
		assertEquals(lc, new ListChar('4', null));
		// push test
		lc.push('1');
		assertEquals(lc, new ListChar('1', new ListChar('4', null)));
		// is empty test
		assertEquals(lc.isEmpty(), false);
		// is empty 2
		lc.pop();
		lc.pop();
		assertEquals(lc.isEmpty(), true);
	}
	@Test
	public void testListChar2() throws EmptyContainerException {
		// Long test 1
		lc.push('a');
		lc.push('2');
		lc.push('r');
		lc.pop();
		lc.push('d');
		lc.push('f');
		lc.pop();
		lc.top();
		lc.push('a');
		lc.pop();
		lc.pop();
		lc.push('d');
		lc.push('f');
		lc.pop();
		lc.top();
		lc.push('a');
		lc.push('a');
		lc.pop();
		assertEquals(lc.top(), 'a');
	}
	// Testing List char
	@Test
	public void testListChar3() throws EmptyContainerException {
		// Long Test 2
		lc.push('a');
		lc.pop();
		lc.push('2');
		lc.push('r');
		lc.pop();
		lc.pop();
		lc.pop();
		lc.push('d');
		lc.push('f');
		lc.pop();
		lc.push('a');
		lc.push('a');
		lc.pop();
		lc.pop();
		lc.pop();
		lc.pop();
		assertEquals(lc.isEmpty(), true);
	}
	// Testing List char
	@Test
	public void testListChar4() throws EmptyContainerException {
		// Long Test 3
		lc.push('a');
		lc.pop();
		lc.push('2');
		lc.push('r');
		lc.pop();
		lc.push('d');
		lc.push('f');
		lc.pop();
		lc.push('a');
		lc.pop();
		lc.top();
		lc.push('1');
		lc.pop();
		lc.push('j');
		lc.push('a');
		lc.isEmpty();
		lc.pop();
		assertEquals(lc.top(), 'j');
	}
	// List Char Exceptions
	// list char exception 1
	@Test(expected = EmptyContainerException.class)
	public void testListCharExc1() throws EmptyContainerException {
		// Long Test 3
		lc.push('a');
		lc.pop();
		lc.push('2');
		lc.push('r');
		lc.pop();
		lc.pop();
		lc.pop();
		lc.push('d');
		lc.push('f');
		lc.pop();
		lc.push('a');
		lc.pop();
		lc.top();
		lc.push('1');
		lc.pop();
		lc.push('j');
		lc.push('a');
		lc.isEmpty();
		lc.pop();
		lc.pop();
		lc.pop();
		lc.pop();
		lc.top();
		fail("The Expected exception did not occur");
	}
	// List char exception 2
    @Test(expected = EmptyContainerException.class)
	public void testListCharExc2() throws EmptyContainerException {
		lc.pop();
		lc.pop();
		lc.top();
		fail("The Expected exception did not occur");
	}
    // List char exception 3
	@Test(expected = EmptyContainerException.class)
	public void testListCharExc3() throws EmptyContainerException {
		lc.pop();
		lc.push('f');
		lc.top();
		lc.pop();
		lc.pop();
		lc.isEmpty();
		lc.top();
		fail("The Expected exception did not occur");
	}
	
	
	//#######################################################################################################################
	//STACK CHAR TESTS
	@Test
	public void testStackChar1() throws EmptyContainerException {
		
		// Test 1: pop
		sc.pop();
		assertEquals(sc, new StackChar());
		// push test
		sc.push('1');
		assertEquals(sc, new StackChar('1'));
		// is empty test
		assertEquals(sc.isEmpty(), false);
		// is empty 2
		sc.pop();
		sc.pop();
		assertEquals(sc.isEmpty(), true);
	}
	@Test
	public void testStackChar2() throws EmptyContainerException {
		// Long test 1
		sc.push('a');
		sc.push('2');
		sc.push('r');
		sc.pop();
		sc.push('d');
		sc.push('f');
		sc.pop();
		sc.top();
		sc.push('a');
		sc.pop();
		sc.pop();
		sc.push('d');
		sc.push('f');
		sc.pop();
		sc.top();
		sc.push('a');
		sc.push('a');
		sc.pop();
		assertEquals(sc.top(), 'a');
	}
	// Testing Stack char
	@Test
	public void testStackChar3() throws EmptyContainerException {
		// Long Test 2
		sc.push('a');
		sc.pop();
		sc.push('2');
		sc.push('r');
		sc.pop();
		sc.pop();
		sc.pop();
		sc.push('d');
		sc.push('f');
		sc.pop();
		sc.push('a');
		sc.push('a');
		sc.pop();
		sc.pop();
		sc.pop();
		assertEquals(sc.isEmpty(), true);
	}
	// Testing Stack char
	@Test
	public void testStackChar4() throws EmptyContainerException {
		// Long Test 3
		sc.push('a');
		sc.pop();
		sc.push('2');
		sc.push('r');
		sc.pop();
		sc.push('d');
		sc.push('f');
		sc.pop();
		sc.push('a');
		sc.pop();
		sc.top();
		sc.push('1');
		sc.pop();
		sc.push('j');
		sc.push('a');
		sc.isEmpty();
		sc.pop();
		assertEquals(sc.top(), 'j');
	}
	// Stack Char Exceptions
	// Stack char exception 1
	@Test(expected = EmptyContainerException.class)
	public void testStackCharExc1() throws EmptyContainerException {
		// Long Test 3
		sc.push('a');
		sc.pop();
		sc.push('2');
		sc.push('r');
		sc.pop();
		sc.pop();
		sc.pop();
		sc.push('d');
		sc.push('f');
		sc.pop();
		sc.push('a');
		sc.pop();
		sc.top();
		sc.push('1');
		sc.pop();
		sc.push('j');
		sc.push('a');
		sc.isEmpty();
		sc.pop();
		sc.pop();
		sc.pop();
		sc.top();
		fail("The Expected exception did not occur");
	}
	// Stack char exception 2
    @Test(expected = EmptyContainerException.class)
	public void testStackCharExc2() throws EmptyContainerException {
		sc.pop();
		sc.top();
		fail("The Expected exception did not occur");
	}
    // Stack char exception 3
	@Test(expected = EmptyContainerException.class)
	public void testStackCharExc3() throws EmptyContainerException {
		sc.pop();
		sc.push('f');
		sc.top();
		sc.pop();
		sc.isEmpty();
		sc.top();
		fail("The Expected exception did not occur");
	}
	// ############################################################################################################
	
	@Test
	public void testSnocList1() throws EmptyContainerException {
		// Test 1: pop
		sl.pop();
		assertEquals(sl, new SnocList('a', null));
		// push test 
		sl.push('1');
		assertEquals(sl, new SnocList('1', new SnocList('a', null)));
		// is empty test
		assertEquals(sl.isEmpty(), false);
		// is empty 2
		sl.pop();
		sl.pop();
		assertEquals(sl.isEmpty(), true);
	}
	@Test
	public void testSnocList2() throws EmptyContainerException {
		// Long test 1
		sl.push('a');
		sl.push('2');
		sl.push('r');
		sl.pop();
		sl.push('d');
		sl.push('f');
		sl.pop();
		sl.peek();
		sl.push('a');
		sl.pop();
		sl.pop();
		sl.push('d');
		sl.push('f');
		sl.pop();
		sl.peek();
		sl.push('a');
		sl.push('a');
		sl.pop();
		assertEquals(sl.peek(), 'a');
	}
	// Testing Snoc List
	@Test
	public void testSnocList3() throws EmptyContainerException {
		// Long Test 2
		sl.push('a');
		sl.pop();
		sl.push('2');
		sl.push('r');
		sl.pop();
		sl.pop();
		sl.pop();
		sl.push('d');
		sl.push('f');
		sl.pop();
		sl.push('a');
		sl.push('a');
		sl.pop();
		sl.pop();
		sl.pop();
		sl.pop();
		assertEquals(sl.isEmpty(), true);
	}
	// Testing Snoc List
	@Test
	public void testSnocList4() throws EmptyContainerException {
		// Long Test 3
		sl.push('a');
		sl.pop();
		sl.push('2');
		sl.push('r');
		sl.pop();
		sl.push('d');
		sl.push('f');
		sl.pop();
		sl.push('a');
		sl.pop();
		sl.peek();
		sl.push('1');
		sl.pop();
		sl.push('j');
		sl.push('a');
		sl.isEmpty();
		sl.pop();
		assertEquals(sl.peek(), 'j');
	}
	// Snoc List Exceptions
	// Snoc List exception 1
	@Test(expected = EmptyContainerException.class)
	public void testSnocListExc1() throws EmptyContainerException {
		// Long Test 3
		sl.push('a');
		sl.pop();
		sl.push('2');
		sl.push('r');
		sl.pop();
		sl.pop();
		sl.pop();
		sl.push('d');
		sl.push('f');
		sl.pop();
		sl.push('a');
		sl.pop();
		sl.peek();
		sl.push('1');
		sl.pop();
		sl.push('j');
		sl.push('a');
		sl.isEmpty();
		sl.pop();
		sl.pop();
		sl.pop();
		sl.pop();
		sl.peek();
		fail("The Expected exception did not occur");
	}
	// Snoc List exception 2
    @Test(expected = EmptyContainerException.class)
	public void testSnocListExc2() throws EmptyContainerException {
		sl.pop();
		sl.pop();
		sl.peek();
		fail("The Expected exception did not occur");
	}
    // Snoc List exception 3
	@Test(expected = EmptyContainerException.class)
	public void testSnocListExc3() throws EmptyContainerException {
		sl.pop();
		sl.push('f');
		sl.peek();
		sl.pop();
		sl.pop();
		sl.isEmpty();
		sl.peek();
		fail("The Expected exception did not occur");
	}
}
