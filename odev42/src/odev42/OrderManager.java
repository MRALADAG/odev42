package odev42;

public class OrderManager implements IOrderService {

	private IPlayerValidationService playerValidationService;
	private ICampaignService campaignGames;

	public OrderManager(IPlayerValidationService playerValidationService, ICampaignService campaignGames) {

		this.playerValidationService = playerValidationService;
		this.campaignGames = campaignGames;
	}

	@Override
	public void gameOrder(Player player, Game game) {

		if ((this.playerValidationService.customerCheckIfPerson(player))
				|| (this.campaignGames.checkCampaignIs(game))) {
			System.out.println(
					"Kampanyalý olan : " + game.getGameName() + " isimli oyunu aldýnýz. " + player.getFirstName());
		} else if (this.playerValidationService.customerCheckIfPerson(player)) {
			System.out.println(game.getGameName() + " isimli oyunun sipariþini verdiniz. " + player.getFirstName());
		} else {
			System.out.println("Geçerli oyuncu bilgisi girilmediðinden sipariþ verilemedi.");
		}

	}

}
