package demoKodlamaio2;

public class UserManager {

		public void add(User user) {
			System.out.println("Kodlamaio'ya kay�tl�s�n�z.");
		}
		
		public void delete (User user) {
			System.out.println( user.id +" Hesab�n�z Silindi.");
		}
		
		public UserManager() {
			System.out.println("ortak manager");
		}
}
