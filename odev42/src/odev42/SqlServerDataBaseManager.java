package odev42;

public class SqlServerDataBaseManager implements IPlayerDataAccessService {

	@Override
	public String saveDatabase(Player player) {

		String message = "Veritaban�na kay�t edildi : SqlServer Database " + player.getFirstName();
		return message;
	}

	@Override
	public String deleteDatabase(Player player) {

		String message = "Veritaban�ndan kay�t silindi : SqlServer Database " + player.getFirstName();
		return message;
	}

	@Override
	public String getDatabase(Player player) {

		String message = "Veri getirildi : SqlServer Database " + player.getFirstName() + " " + player.getLastName();
		return message;

	}

}
