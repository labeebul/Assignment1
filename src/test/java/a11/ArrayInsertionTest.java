package a11;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayInsertionTest {
	
	private ArrayInsertion aris;
	@Before
	public void constructor() {
		aris=new ArrayInsertion();
	}
	
	
	
	@SuppressWarnings("static-access")
	@Test
	public void Insertiontesting() {
		int [] mainarray=new int[10];
		int[] expectations= {0,0,4,0,5,5,5,5,0,0};
		for(int i=5;i>1;i=i-1) {
			aris.insert(mainarray,i+2,i);
		}
		aris.insert(mainarray,5,5);
		aris.insert(mainarray,5,5);
		aris.insert(mainarray,5,5);
		assertArrayEquals(mainarray,expectations);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testingSize() {
		int [] mainarray=new int[0];
		for(int k=0;k<5;k++) {
		aris.insert(mainarray,k*10,k);
		}
		assertEquals(0,mainarray.length);
		assertNotEquals(5,mainarray.length);
		
		
	}
	

}
