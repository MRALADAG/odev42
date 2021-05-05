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
					"Kampanyal� olan : " + game.getGameName() + " isimli oyunu ald�n�z. " + player.getFirstName());
		} else if (this.playerValidationService.customerCheckIfPerson(player)) {
			System.out.println(game.getGameName() + " isimli oyunun sipari�ini verdiniz. " + player.getFirstName());
		} else {
			System.out.println("Ge�erli oyuncu bilgisi girilmedi�inden sipari� verilemedi.");
		}

	}

}
