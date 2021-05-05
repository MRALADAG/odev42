package odev42;

public class Main {

	public static void main(String[] args) {

		Player player = new Player(1, "Engin", "Demiroð", 1985, "3697741564584");

		PlayerManager playerManager = new PlayerManager(new MernisCustomerCheckService(),
				new SqlServerDataBaseManager());

		playerManager.add(player);

	}

}
