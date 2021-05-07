package gameProject.core;

import gameProject.MernisSystem.TCKNDogrulamaManager;
import gameProject.entities.concretes.User;

public class TCKNDogrulmaManagerAdapter implements NationalyIdCheckService {

	@Override
	public boolean checkNationalyId(User user) {
		TCKNDogrulamaManager tcknDogrulamaManager = new TCKNDogrulamaManager();
		tcknDogrulamaManager.tcKimlikNoDogrula(user.getFirstName(), user.getLastName(),
				Long.parseLong(user.getNationalyId()), Integer.parseInt(user.getYearOfBirth()));

		if (Integer.parseInt(user.getYearOfBirth()) == 1997) {
			return true;
		}
		return false;
	}

}
