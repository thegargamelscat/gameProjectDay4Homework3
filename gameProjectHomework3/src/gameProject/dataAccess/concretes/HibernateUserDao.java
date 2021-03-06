package gameProject.dataAccess.concretes;

import gameProject.dataAccess.abstracts.UserDao;
import gameProject.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("HibernateUserDao.add()");
		System.err.println("Veritabanına eklendi:" + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("HibernateUserDao.update()");
		System.err.println("Veritabanında Güncellendi :" + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		System.out.println("HibernateUserDao.delete()");
		System.err.println("Veritabanından Slindi :" + user.getFirstName());

	}
}
