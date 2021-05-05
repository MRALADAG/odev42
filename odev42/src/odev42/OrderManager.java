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

		if (this.playerValidationService.customerCheckIfPerson(player)) {
			System.out.println();
		} else {

		}

	}

}
