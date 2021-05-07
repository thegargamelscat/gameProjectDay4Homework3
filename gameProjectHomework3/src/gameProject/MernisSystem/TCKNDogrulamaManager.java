package gameProject.MernisSystem;

public class TCKNDogrulamaManager {
	public boolean tcKimlikNoDogrula(String ad,String soyad,long TCKimlikNo,int dogumYýlý) {
		if (dogumYýlý==1997) {
			return true;
		}else {
			return false;
		}		
	}
}
