package odev42;

public class OracleDataBaseManager implements IPlayerDataAccessService {

	@Override
	public String saveDatabase(Player player) {

		String message = "Veritabanýna kayýt edildi : Oracle Database " + player.getFirstName();

		return message;
	}

	@Override
	public String deleteDatabase(Player player) {

		String message = "Veritabanýndan silindi : Oracle Database " + player.getFirstName();

		return message;
	}

	@Override
	public String getDatabase(Player player) {

		String message = "Veri getirildi : Oracle Database " + player.getFirstName() + " " + player.getLastName();

		return message;
	}

}
