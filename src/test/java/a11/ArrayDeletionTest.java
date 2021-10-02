package a11;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class ArrayDeletionTest {

	private ArrayDeletion initializer;
	@Before
	public void initializeration() {
		initializer=new ArrayDeletion();
	}
	@SuppressWarnings("static-access")
	@Test
	public void testFordeletion() {

		int[] arr1= {12,23,34,45,7,68,79,78};
		int[] arr2= {12,23,34,45,-1,-1,-1,-1};
		
		arr1=initializer.delete(arr1,4);
		initializer.display(arr1);
		arr1=initializer.delete(arr1,4);
		arr1=initializer.delete(arr1,4);
		arr1=initializer.delete(arr1,4);
		initializer.display(arr1);
		//the next statement will delete nothing
		arr1=initializer.delete(arr1,18);
		assertArrayEquals(arr2,arr1);
			
	}

}
