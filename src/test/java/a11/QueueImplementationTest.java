package a11;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

public class QueueImplementationTest {


QueueImplementation objective;
@Before
public void initializer()
{
	objective=new QueueImplementation(5);
}

@Test
public void emptytest() throws Exception
{
	objective=new QueueImplementation(5);
	
	assertEquals(true,objective.empty());
	objective.enqueue(4);
	assertEquals(false,objective.empty());
}

	
	@Test
	public void sizetest() throws Exception
	{
		assertEquals(0,objective.size());	
		objective.enqueue(1);
		assertEquals(1,objective.size());	
		objective.enqueue(1);
		objective.enqueue(1);
		objective.enqueue(1);
		assertEquals(4,objective.size());
		objective.dequeue();
		objective.dequeue();
		assertEquals(2,objective.size());
	}
	
	@Test
	public void testenqueue() throws Exception
	{
		
		objective.enqueue(5);
		objective.enqueue(4);
		objective.enqueue(3);
		objective.enqueue(2);
		objective.enqueue(1);
		assertEquals(5,objective.sizeofQueue);
		Assert.assertThrows(Exception.class, () -> objective.enqueue(45));
	}
	
	@Test
	public void testdequeue() throws Exception
	{
		Assert.assertThrows(Exception.class, () -> objective.dequeue());
		for(int i=0;i<5;i++)
		{
			objective.enqueue(i);
		}
		
		assertEquals(0,objective.dequeue());
		objective.display();
	
	}

}