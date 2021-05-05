package odev42;

public interface IPlayerDataAccessService {

	String saveDatabase(Player player);

	String deleteDatabase(Player player);

	String getDatabase(Player player);
}
