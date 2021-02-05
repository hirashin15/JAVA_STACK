package projectClass;

public class projectClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		projectClass first = new projectClass();
		projectClass second = new projectClass("birthday");
		projectClass third = new projectClass("anniversary", "50th year of the company");
		
		System.out.println(first.getName());
		System.out.println(second.getName());
		System.out.println(third.getName());
		
		System.out.println(first.getDescription());
		System.out.println(second.getDescription());
		System.out.println(third.getDescription());
		
		first.setDescription("desc 1");
		second.setDescription("desc 2");
		third.setDescription("desc 3");
		
		System.out.println(first.elevatorPitch());
		System.out.println(second.elevatorPitch());
		System.out.println(third.elevatorPitch());
	}

}
