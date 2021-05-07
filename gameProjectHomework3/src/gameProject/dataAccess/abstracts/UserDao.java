package gameProject.dataAccess.abstracts;

import gameProject.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	
}
