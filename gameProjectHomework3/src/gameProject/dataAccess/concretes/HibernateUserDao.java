package gameProject.dataAccess.concretes;

import gameProject.dataAccess.abstracts.UserDao;
import gameProject.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("HibernateUserDao.add()");
		System.err.println("Veritaban�na eklendi:" + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("HibernateUserDao.update()");
		System.err.println("Veritaban�nda G�ncellendi :" + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		System.out.println("HibernateUserDao.delete()");
		System.err.println("Veritaban�ndan Slindi :" + user.getFirstName());

	}
}
