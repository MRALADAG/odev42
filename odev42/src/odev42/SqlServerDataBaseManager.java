package odev42;

public class SqlServerDataBaseManager implements IPlayerDataAccessService {

	@Override
	public String saveDatabase(Player player) {

		String message = "Veritabanına kayıt edildi : SqlServer Database " + player.getFirstName();
		return message;
	}

	@Override
	public String deleteDatabase(Player player) {

		String message = "Veritabanından kayıt silindi : SqlServer Database " + player.getFirstName();
		return message;
	}

	@Override
	public String getDatabase(Player player) {

		String message = "Veri getirildi : SqlServer Database " + player.getFirstName() + " " + player.getLastName();
		return message;

	}

}
