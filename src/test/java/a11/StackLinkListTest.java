package a11;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackLinkListTest {
	
	StackLinkList aris;
@Before
public void constructor()
{
	aris=new StackLinkList();
}

	@Test
	public void TestNode()
	{
		StackLinkList.Node arisnode=new StackLinkList.Node(8);
		assertEquals(8,arisnode.key);
		
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void Testpush()
	{
		assertEquals(0,aris.size);
		for(int i=0;i<5;i++)
		{
			aris.push(i);
		}
		
		assertEquals(5,aris.size);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void Testtop()
	{
		assertEquals(-1,aris.top());
		for(int i=0;i<5;i++)
		{
			aris.push(i);
		}
		
		assertEquals(4,aris.top());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void Testpop()
	{
		assertEquals(-1,aris.pop());
		
		aris.push(0);
		aris.push(1);
		aris.push(2);
		aris.push(3);
		aris.push(4);
		aris.pop();
		aris.pop();
		aris.display();
		assertEquals(2,aris.top());
	}

	@SuppressWarnings("static-access")
	@Test
	public void TestSize()
	{
		for(int i=10;i<15;i++)
		{
			aris.push(i);
		}
		
		assertEquals(5,aris.getSize());
	}

}
