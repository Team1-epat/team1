import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ToDoList {
private HashMap<String, Task> tasks = new HashMap<String, Task>();
	
	public void addTask (Task task) {
		if(task != null){
			tasks.put(task.getDescription(), task);
		}
	}
	public void completeTask(String description) {
		Task task = tasks.get(description);
		if(task != null){
			task.setComplete(true);
			tasks.put(description, task);	
		}
	}
	public boolean getStatus(String description) {
		Task task = tasks.get(description);
		if(task != null){
			return task.isComplete();	
		}else{
			
			return false;
		}
	}
	public Task getTask(String description) {
		Task task = tasks.get(description);
		if(task != null){
			return task;	
		}else{
			return null;
		}
	}
	public Task removeTask(String description) {
		Task task = tasks.get(description);
		if(task != null){
			tasks.remove(description);
			return task;
		}
		return null;
	}
	public Collection<Task> getAllTasks() {
		return tasks.values();
	}
	public Collection<Task> getCompletedTasks() {
		Collection<Task> completedTasks = new ArrayList<Task>();
		
		for(Map.Entry<String, Task> completed: tasks.entrySet()){
			if(completed.getValue().isComplete()){
				completedTasks.add(completed.getValue());
			}
		}
		return completedTasks;
	}
}
