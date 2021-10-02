package a11;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.Exception;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.lang.Exception;

@SuppressWarnings("unused")
public class MyStackTest {

	MyStack aris;
@Before
public void constructor()
{
	aris=new MyStack(5);
}


	
	
	@Test
	public void PushStackTest() throws Exception
	{
		for(int i=0;i<5;i++)
		{
			aris.push(i);
		}
		
		assertEquals(5,aris.size());
		Assert.assertThrows(Exception.class, () -> aris.push(300));
	}
	@Test
	public void TopStackTest() throws Exception
	{
		
		Assert.assertThrows(Exception.class, () ->aris.top());
		for(int i=10;i<14;i++)
		{
			aris.push(i);
		}
		assertEquals(13,aris.top());
		
		
		
	}
	
	@Test
	public void SizeStacktest() throws Exception
	{
		for(int i=0;i<5;i++)
		{
			aris.push(1);
		}
		
		assertEquals(5,aris.size());
	}

	@Test
	public void PopStacktest() throws Exception
	{
		
		Assert.assertThrows(Exception.class, () -> aris.pop());
		for(int i=20;i<24;i++)
		{
			aris.push(i);
		}
		aris.displayStack();
		aris.pop();
		assertEquals(22,aris.top());
	}

}
