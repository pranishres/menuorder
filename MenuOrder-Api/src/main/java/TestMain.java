import org.springframework.beans.factory.annotation.Autowired;

import com.menuorder.api.persistence.entity.User;
import com.menuorder.api.persistence.service.UserService;

public class TestMain {

	@Autowired
	UserService userService;

	public static void main(String args[]) {
		System.out.println(" This is menu order application");
		TestMain testMain = new TestMain();
		testMain.saveUserTest();
		
	}

	private void saveUserTest() {

		User user = new User();
		user.setFirstName("Pranish");
		user.setLastName("shrestha");
		user.setMiddleName("maan");
		user.setPassword("asddf");
		user.setUsername("ranish");

		User updateduser = userService.saveOrUpdate(user);
	}
}
