import java.util.Collection;

import org.junit.*;
import static org.junit.Assert.*;

public class ToDoListTest{
	// Define Test Fixtures
	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		//Initialise Test Fixtures
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialise test Fixtures
	}
	@Test
	public void testAddTask() {
		Task task1 = new Task("task 1");
		Task task2 = new Task("task 2");
		
		ToDoList toDoList = new ToDoList();
		toDoList.addTask(task1);
		toDoList.addTask(task2);
		
		Collection<Task> allTasks = toDoList.getAllTasks();
		
		assertNotNull(allTasks);
		assertEquals(2, allTasks.size());
	}
	@Test
	public void testgetStatus() {
		Task task1 = new Task("task 1");
		Task task2 = new Task("task 2", true);
		
		ToDoList toDoList = new ToDoList();
		toDoList.addTask(task1);
		toDoList.addTask(task2);
		
		boolean status = toDoList.getStatus("task 1");
		assertFalse(status);
		
		boolean status2 = toDoList.getStatus("task 2");
		assertTrue(status2);
	}
	@Test
	public void testRemoveTask() {
		Task task1 = new Task("task 1");
		Task task2 = new Task("task 2", true);
		
		ToDoList toDoList = new ToDoList();
		toDoList.addTask(task1);
		toDoList.addTask(task2);
		
		Task removedTask = toDoList.removeTask("task 1");
		assertNotNull(removedTask);
		assertEquals(1, toDoList.getAllTasks().size());
	}
	@Test
	public void testGetCompletedTasks() {
		Task task1 = new Task("task 1");
		Task task2 = new Task("task 2", true);
		Task task3 = new Task("task 3", false);
		Task task4 = new Task("task 4", true);
	
		ToDoList toDoList = new ToDoList();
		toDoList.addTask(task1);
		toDoList.addTask(task2);
		toDoList.addTask(task3);
		toDoList.addTask(task4);
	
		Collection<Task> result = toDoList.getCompletedTasks();
		assertEquals(2, result.size());
		assertNotNull(result);
	}
	@Test
	public void testGetAllTasks(){
		Task task1 = new Task("task1");
		Task task2 = new Task("task2");
		
		ToDoList toDoList = new ToDoList();
		toDoList.addTask(task1);
		toDoList.addTask(task2);
		
		Collection<Task> allTasks = toDoList.getAllTasks();
		assertNotNull(allTasks);
	}
}
