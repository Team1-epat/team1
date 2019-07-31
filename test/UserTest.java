
import org.junit.*;
import static org.junit.Assert.*;

public class UserTest{
	// Define Test Fixtures
	User user = null;
	String customer = "customer";
	String developer = "developer";
	String manager = "manager";
	public UserTest() {
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
	public void testUserTypes() {
		user = User.valueOf(customer.toUpperCase());
		assertTrue(User.CUSTOMER.equals(user));
		user = User.valueOf(developer.toUpperCase());
		assertTrue(User.DEVELOPER.equals(user));
		user = User.valueOf(manager.toUpperCase());
		assertTrue(User.MANAGER.equals(user));
	}

}
