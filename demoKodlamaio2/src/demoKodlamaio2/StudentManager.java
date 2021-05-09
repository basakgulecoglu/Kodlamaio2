package demoKodlamaio2;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Kodlamaio'ya kayýtlýsýnýz.");
	}
	
	public void delete (Student student) {
		System.out.println( student.firstName +" Hesabýnýz Silindi.");
	}
	
	

}
