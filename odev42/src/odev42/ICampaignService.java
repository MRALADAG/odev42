package odev42;

import java.util.ArrayList;

public interface ICampaignService {

	void campaignAdd(Game game);

	void campaignDelete(Game game);

	void campaignUpdate(Game game);

	boolean checkCampaignIs(Game game);

	ArrayList<Game> getAllCampaignGames();

}
