package demoKodlamaio2;

public class UserManager {

		public void add(User user) {
			System.out.println("Kodlamaio'ya kayıtlısınız.");
		}
		
		public void delete (User user) {
			System.out.println( user.id +" Hesabınız Silindi.");
		}
		
		public UserManager() {
			System.out.println("ortak manager");
		}
}
