package odev42;

public class CampaignManager implements ICampaignService {

	Game[] _games;
	Game[] _campaignGames;
	Game[] temp;

	public void CampaignManager() {
		this._games = new Game[] { new Game(1, "WarCaraft"), new Game(2, "NEEDforSPEED"), new Game(3, "MortalCombat"),
				new Game(4, "FIFA"), new Game(5, "CALLofDUTY"), new Game(6, "WinningEleven2020") };
		this._campaignGames = new Game[] {};
		this.temp = new Game[] {};
	}

	@Override
	public void campaignAdd(Game game) {

		this._games[this._campaignGames.length] = game;

		System.out.println(game.getGameName() + " isimli oyun için kampanya eklemiþtir.");

	}

	@Override
	public void campaignDelete(Game game) {

		for (int k = 0; k < this._campaignGames.length; k++) {
			for (int i = 0; i < this._campaignGames.length; i++) {
				if ((this._campaignGames[i].getGameName() == game.getGameName())
						|| (this._campaignGames[i].getGameId() == game.getGameId())) {

					i = i + 1;

				}
				if (i < this._campaignGames.length) {
					temp[k] = this._campaignGames[i];
				} else {
					this._campaignGames = temp;
				}

			}

		}

		System.out.println(game.getGameName() + " isimli oyunun kampanyasý son bulmuþtur.");

	}

	@Override
	public void campaignUpdate(Game game) {

		System.out.println(game.getGameName() + " isimli oyun için kampanya güncellenmiþtir.");

	}

	@Override
	public boolean checkCampaignIs(Game game) {
		for (Game game1 : this._campaignGames) {
			if ((game1.getGameName() == game.getGameName()) || (game1.getGameId() == game.getGameId()))

				return true;
		}

		return false;

	}

	@Override
	public Game[] getAllCampaignGames() {
		// TODO Auto-generated method stub
		return this._campaignGames;
	}

}
