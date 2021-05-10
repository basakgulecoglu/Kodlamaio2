package demoKodlamaio2;

public class UserManager {

		public void add(User user) {
			System.out.println("Kodlamaio'ya kayýtlýsýnýz.");
		}
		
		public void delete (User user) {
			System.out.println( user.id +" Hesabýnýz Silindi.");
		}
		
		public UserManager() {
			System.out.println("ortak manager");
		}
}
