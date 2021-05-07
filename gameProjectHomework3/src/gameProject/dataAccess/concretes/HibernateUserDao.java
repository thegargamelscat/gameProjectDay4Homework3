package gameProject.dataAccess.concretes;

import gameProject.dataAccess.abstracts.UserDao;
import gameProject.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("HibernateUserDao.add()");
		System.err.println("Veritabanýna eklendi:" + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("HibernateUserDao.update()");
		System.err.println("Veritabanýnda Güncellendi :" + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		System.out.println("HibernateUserDao.delete()");
		System.err.println("Veritabanýndan Slindi :" + user.getFirstName());

	}
}
