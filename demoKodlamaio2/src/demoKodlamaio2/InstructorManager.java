package demoKodlamaio2;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println("Kodlamaio'ya kay�tl�s�n�z.");
	}
	
	public void delete (Instructor instructor) {
		System.out.println( instructor.userNumber +" Hesab�n�z Silindi.");
	}
}
