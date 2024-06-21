package email_application;

public class email_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("John", "Smith");
		
		System.out.println(em1.showInfo());
		
//		em1.setAlternateEmail("a4@gmail.com");
//		System.out.println("Your alternate email is : " + em1.getAlternateEmail());
	}

}
