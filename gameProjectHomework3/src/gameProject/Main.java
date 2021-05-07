package gameProject;

import java.util.ArrayList;
import java.util.List;

import gameProject.business.abstracts.CampaignService;
import gameProject.business.abstracts.GameService;
import gameProject.business.abstracts.SaleService;
import gameProject.business.abstracts.UserService;
import gameProject.business.concretes.CampaignManager;
import gameProject.business.concretes.GameManager;
import gameProject.business.concretes.SaleManager;
import gameProject.business.concretes.UserManager;
import gameProject.core.TCKNDogrulmaManagerAdapter;
import gameProject.dataAccess.concretes.HibernateCampignDao;
import gameProject.dataAccess.concretes.HibernateGameDao;
import gameProject.dataAccess.concretes.HibernateSaleDao;
import gameProject.dataAccess.concretes.HibernateUserDao;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main.main()");
		UserService userService = new UserManager(new HibernateUserDao(),new TCKNDogrulmaManagerAdapter());
		User recep = new User(1,"Recep","Azman","rcpazman@gmail.com","12345678901","1997");
		User semih = new User(2,"Semih","Azman","semihazman@gmail.com","12345678902","1989");
		
		User[] users = {recep,semih};
		for (User user : users) {
			userService.add(user);
		}
		
		GameService gameService = new GameManager(new HibernateGameDao());
		Game csgo = new Game(1,"CSGO",79);
		Game valo = new Game(2,"Valorant",90);
		Game gta5 = new Game(3,"GTAV",100);
		Game rdr2 = new Game(4,"RDR2",300);
		Game[] games = {csgo,valo,gta5,rdr2};
		for (Game game : games) {
			gameService.add(game);
		}
		
		
		
		CampaignService campaignService = new CampaignManager(new HibernateCampignDao());
		
		List<String> list1 = new ArrayList<String>();
		list1.add("CSGO");
		list1.add("CTAV");
		
		Campaign campaign1 = new Campaign(1,"Yaz Ýndirimi",0.40,list1);
		campaignService.add(campaign1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("RDR2");
		list2.add("Valorant");
		
		Campaign campaign2 = new Campaign(2,"Son Bahar kampanyasý",0.60,list2);
		campaignService.add(campaign2);
		
		SaleService saleService = new SaleManager(new HibernateSaleDao());
		saleService.sale(semih, gta5);
		saleService.campaignSale(recep, rdr2, campaign1);
		
		
		
	
		
		
	}

}
