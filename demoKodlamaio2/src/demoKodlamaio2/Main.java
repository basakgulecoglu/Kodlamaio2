package demoKodlamaio2;

public class Main {

	public static void main(String[] args) {
		
		Instructor egitmen = new Instructor();	
		egitmen.firstName="Engin";
		egitmen.lastName="Demiro�";
		egitmen.userNumber="10";
		
		Student student = new Student();
		student.firstName="Ba�ak";
		student.lastName = "G�le�o�lu";	
		student.userNumber="2";
		
		
		UserManager userManager = new UserManager();
		
		userManager.add(student);
		userManager.delete(egitmen);



		
		
		
		
		}

}
