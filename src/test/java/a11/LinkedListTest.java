package a11;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class LinkedListTest {
	 private LinkedList listyy;

	@Before
	public void iniObj() {
		listyy = new LinkedList();

	}
	@SuppressWarnings("static-access")
	@Test
	public void Testingpop() {
		listyy.pop(0);
		listyy.pushFront(81);
		listyy.pushFront(43);
		listyy.pushBack(10);
		listyy.pushBack(90);

		listyy.pop(3);
		
		assertEquals(43, listyy.head.key);
		assertEquals(81, listyy.head.next.key);
		assertEquals(3, listyy.size);

		listyy.pop(0);
		assertEquals(2, listyy.size);
		assertEquals(81, listyy.head.key);
		listyy.pop(3);
		
	}

	@SuppressWarnings("static-access")
	@Test
	public void pBack() {
		assertEquals(null,listyy.head);
		listyy.popBack();
		listyy.pushBack(420);
		listyy.popBack();
		assertEquals(0, listyy.size);
		assertEquals(null, listyy.head);

		listyy.pushFront(5);
		listyy.pushFront(4);
		listyy.pushFront(3);
		listyy.pushFront(2);
		listyy.pushFront(1);
		listyy.popBack();
		listyy.popBack();
		
		assertEquals(3, listyy.size);
		assertEquals(1,listyy.head.key);
	}

	@SuppressWarnings("static-access")
	@Test
	public void Constructor() {
		//testing display function for empty LinkedList
	
		//comparing with size that linked list is empty or not
		assertEquals(0, listyy.size);
		assertEquals(null, listyy.head);
	}

	@SuppressWarnings("static-access")
	@Test
	public void pFront() {
		listyy.pushFront(7);
		listyy.pushFront(12);
		listyy.pushFront(89);
		assertEquals(89,listyy.head.key);
		assertEquals(12,listyy.head.next.key);
		assertEquals(7,listyy.head.next.next.key);
		assertEquals(listyy.size, 3);
	}

	@SuppressWarnings("static-access")
	@Test
	public void ppBack() {
		listyy.pushBack(5);
		listyy.pushBack(4);
		listyy.pushBack(3);
		listyy.pushBack(2);
		assertEquals(5,listyy.head.key);
		assertEquals(4,listyy.head.next.key);
		assertEquals(3,listyy.head.next.next.key);
		assertEquals(2,listyy.head.next.next.next.key);
		assertEquals(listyy.size, 4);
	}

	
	@SuppressWarnings("static-access")
	@Test
	public void ppFront() {

		listyy.popFront();
		assertEquals(0, listyy.size);

		listyy.pushFront(6);
		listyy.pushFront(2);
		listyy.pushFront(7);
		listyy.pushFront(76);
		listyy.pushFront(23);
		listyy.popFront();

		assertEquals(4, listyy.size);
		assertEquals(76,listyy.head.key);
	}

}
