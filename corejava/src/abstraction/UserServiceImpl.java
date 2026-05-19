package abstraction;

public class UserServiceImpl implements UserService, CommonService{

	@Override
	public void addUser() {
		System.out.println("User added successfully");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("User deleted successfully");
		
	}

	@Override
	public void print() {
		System.out.println("Common Service");
		
	}
	
}
