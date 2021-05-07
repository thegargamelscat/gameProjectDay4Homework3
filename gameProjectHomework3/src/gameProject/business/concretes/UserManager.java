package gameProject.business.concretes;

import gameProject.business.abstracts.UserService;
import gameProject.core.NationalyIdCheckService;
import gameProject.dataAccess.abstracts.UserDao;
import gameProject.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private NationalyIdCheckService nationalyIdCheckService;
	
	public UserManager(UserDao userDao,NationalyIdCheckService nationalyIdCheckService) {
		super();
		this.userDao = userDao;
		this.nationalyIdCheckService = nationalyIdCheckService;
	}
	
	@Override
	public void add(User user) {
		System.out.println("UserManager.add()");
		if (nationalyIdCheckService.checkNationalyId(user)) {
			System.err.println("TCKN Dogrulandý");
			this.userDao.add(user);
		}else {
			
			System.err.println("TCKN Dogrulanmadý!");
		}
	}

	@Override
	public void update(User user) {
		System.out.println("UserManager.update()");
	}

	@Override
	public void delete(User user) {
		System.out.println("UserManager.delete()");
		
	}
}
