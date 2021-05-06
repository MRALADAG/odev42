package odev42;

import java.util.ArrayList;

public class CampaignManager implements ICampaignService {

	ArrayList<Game> _games;
	ArrayList<Game> _campaignGames;

	public CampaignManager() {

		this._games = new ArrayList<Game>() {
		};
		this._campaignGames = new ArrayList<Game>() {
		};
		this._games.add(new Game(1, "WarCaraft"));
		this._games.add(new Game(2, "NEEDforSPEED"));
		this._games.add(new Game(3, "MortalCombat"));
	}

	@Override
	public void campaignAdd(Game game) {

		this._games.add(game);

		System.out.println(game.getGameName() + " isimli oyun için kampanya eklemiþtir.");

	}

	@Override
	public void campaignDelete(Game game) {

		this._campaignGames.remove(game);
		System.out.println(game.getGameName() + " isimli oyunun kampanyasý son bulmuþtur.");
	}

	@Override
	public void campaignUpdate(Game game) {

		System.out.println(game.getGameName() + " isimli oyun için kampanya güncellenmiþtir.");
	}

	@Override
	public boolean checkCampaignIs(Game game) {

		if (this._campaignGames.contains(game)) {
			return true;
		} else {
			return false;
		}

//		for (Game game1 : this._campaignGames) {
//			if ((game1.getGameName() == game.getGameName()) || (game1.getGameId() == game.getGameId()))
//
//				return true;
//		}
//
//		return false;
	}

	@Override
	public ArrayList<Game> getAllCampaignGames() {

		return this._campaignGames;
	}

}
