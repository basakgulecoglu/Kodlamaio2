package demoKodlamaio2;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println("Kodlamaio'ya kayıtlısınız.");
	}
	
	public void delete (Instructor instructor) {
		System.out.println( instructor.userNumber +" Hesabınız Silindi.");
	}
}
