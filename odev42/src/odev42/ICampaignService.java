package odev42;

public interface ICampaignService {

	void campaignAdd(Game game);

	void campaignDelete(Game game);

	void campaignUpdate(Game game);

	boolean checkCampaignIs(Game game);

	Game[] getAllCampaignGames();

}
