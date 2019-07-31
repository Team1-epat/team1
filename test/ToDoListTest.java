import java.util.Collection;

import org.junit.*;
import static org.junit.Assert.*;



public class ToDoListTest{
	// Define Test Fixtures
	Task mytask1 = new Task("mytask 1");
	Task mytask2 = new Task("mytask 2");
	ToDoList list = new ToDoList();
	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{	
		list.addTask(mytask1);
		list.addTask(mytask2);
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {
		
		assertTrue(!list.getAllTasks().equals(null));
		assertNotSame(mytask1,mytask2);	
	}
	@Test
	public void testgetStatus() {
		fail("Not implemented yet");
	}
	@Test
	public void testRemoveTask() {
		list.removeTask("mytask 1");
		list.removeTask("mytask 2");
		assertTrue(list.getAllTasks().equals(null));
	}
	
	@Test
	public void testGetCompletedTasks() {
		fail("Not implemented yet");
	}
}
