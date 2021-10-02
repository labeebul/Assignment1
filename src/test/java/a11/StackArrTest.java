package a11;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackArrTest {

	StackArr aris;
@Before
public void constructor()
{
	aris=new StackArr();
}

	@SuppressWarnings("static-access")
	@Test
	public void Testpush()
	{
		aris.display();
		aris.push(1);
		assertEquals(1,aris.size);
		for(int i=0;i<100;i++) {
			aris.push(i);
		}
		assertEquals(98,aris.pop());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void Testpop()
	{
		assertEquals(-1,aris.pop());
		for(int i=0;i<100;i++) {
			aris.push(i);
		}
		assertEquals(100,aris.size);
	}
	

}
