package a11;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueLinkListTest {

	QueueLinkList aris;
	@Before
	public void constructor()
	{
		aris=new QueueLinkList();
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public void testingdequeue()
	{
		
		for(int i=10;i<20;i++)
		{
			aris.enqueue(i);
		}
		for(int i=10;i<20;i++)
		{
			aris.dequeue();
		}
		//aris.dequeue();
		assertEquals(-1,aris.dequeue());
		aris.dequeue();
		assertEquals(-1,aris.dequeue());
		aris.enqueue(7);
		assertEquals(1,aris.size);
	}
	@Test
	public void testingnode()
	{
		QueueLinkList.Node arisnode=new QueueLinkList.Node(3);
		assertEquals(arisnode.key,3);
	}
	@SuppressWarnings("static-access")
	@Test
	public void testingenqueue()
	{
		for(int i=10;i<20;i++)
		{
			aris.enqueue(i);
		}
			
	assertEquals(10,aris.size);
		aris.display();
	}


}