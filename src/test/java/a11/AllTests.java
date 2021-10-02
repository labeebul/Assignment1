package a11;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayDeletionTest.class, ArrayInsertionTest.class, ArrayTest.class, LinkedListTest.class,
		MyStackTest.class, QueueImplementationTest.class, QueueLinkListTest.class, StackArrTest.class,
		StackLinkListTest.class })
public class AllTests {

}
