package a11;


import static org.junit.Assert.*;
import java.lang.Math;
import org.junit.Before;
import org.junit.Test;
public class ArrayTest {
	private Array aris;
	@Before
	public void arisInitial() {
		aris=new Array();
	}
	@SuppressWarnings("static-access")
	@Test
	public void ariasinsert() {
		int size=0;
		assertEquals(size,aris.size);
		for(int i=0,j=0;i<50;i++,j=j+5)
		{
				aris.insert(j, i);
		}
		aris.insert(32, 48);
		assertEquals(51,aris.size);

		
	}
	@SuppressWarnings("static-access")
	@Test
	public void ariasdel() {
		aris.insert(23, 0);
		aris.insert(54, 1);
		aris.insert(12, 2);
		aris.insert(76, 3);
		aris.insert(9, 4);
		assertEquals(5,aris.size);
		aris.delete(3);
		aris.delete(4);
		assertEquals(3,aris.size);
		
	}

	@SuppressWarnings("static-access")
	@Test
	public void linearSearch() {
		aris.insert(23, 0);
		aris.insert(54, 1);
		aris.insert(12, 2);
		aris.insert(76, 3);
		aris.insert(9, 4);
		assertEquals(true,aris.linearSearch(12));
		assertEquals(false,aris.linearSearch(69));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void arislinsarch() {
		aris.insert(23, 0);
		aris.insert(54, 1);
		aris.insert(12, 2);
		aris.insert(76, 3);
		aris.insert(9, 4);
		aris.bubbleSort();
		aris.display();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void arislinearch() {
		aris.insert(23, 0);
		aris.insert(54, 1);
		aris.insert(12, 2);
		aris.insert(76, 3);
		aris.insert(9, 4);
		assertEquals(true,aris.binarySearch(12, 0, aris.size));
		assertEquals(true,aris.binarySearch(23, 0, 2));
		assertEquals(false,aris.binarySearch(111, 0, aris.size));
	}
	@SuppressWarnings("static-access")
	@Test
	public void GetValues() {
		//aris.getValues();
	}
}
