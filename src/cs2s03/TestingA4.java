package cs2s03;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestingA4 {

	static ListChar lc;
	static private StackChar sc;
	@Before
	public void setUp() {
		// this will create a new instance of each item every time a
		// class is called so that we are working with a fresh list/stack/queue
		lc = new ListChar('a', new ListChar('4', null));
		sc = new StackChar();
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
}
