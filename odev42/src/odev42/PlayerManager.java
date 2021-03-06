package odev42;

public class PlayerManager implements IPlayerService {

	private IPlayerValidationService playerValidationService;
	private IPlayerDataAccessService accessService;

	public PlayerManager(IPlayerValidationService playerValidationService, IPlayerDataAccessService accessService) {

		this.playerValidationService = playerValidationService;
		this.accessService = accessService;

	}

	@Override
	public void add(Player player) {

		if (playerValidationService.customerCheckIfPerson(player)) {

			System.out.println("Oyuncu " + this.accessService.saveDatabase(player));
		} else {

			System.out.println(
					"Eklenmek istenen oyuncunun kimlik bilgileri geçersiz olduğundan oyuncu sisteme eklenememiştir.");
		}

	}

	@Override
	public void del(Player player) {

		if (playerValidationService.customerCheckIfPerson(player)) {

			System.out.println("Oyuncu " + this.accessService.deleteDatabase(player));
		} else {
			System.out.println(
					"Silinmesi istenen kayıt kimlik bilgileri geçersiz olduğundan işleminiz gerçekleştirilememiştir.");
		}

	}

	@Override
	public void update(Player player) {

		if (playerValidationService.customerCheckIfPerson(player)) {

			System.out.println(this.accessService.getDatabase(player) + player.getFirstName()
					+ "isimli oyuncu bilgileri güncellendi.");
		} else {
			System.out.println(
					"Güncellenmesi istenilen kayıt kimlik bilgileri geçersiz olduğundan işleminiz gerçekleştirilememiştir.");
		}

	}

}
