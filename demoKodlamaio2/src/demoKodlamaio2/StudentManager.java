package demoKodlamaio2;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Kodlamaio'ya kay�tl�s�n�z.");
	}
	
	public void delete (Student student) {
		System.out.println( student.firstName +" Hesab�n�z Silindi.");
	}
	
	

}
