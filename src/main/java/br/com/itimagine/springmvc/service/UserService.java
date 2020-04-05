package br.com.itimagine.springmvc.service;

import java.util.List;

import br.com.itimagine.springmvc.model.User;

public interface UserService {

	User findById(int id);

	User findBySSO(String sso);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserBySSO(String sso);

	List<User> findAllUsers();

	boolean isUserSSOUnique(Integer id, String sso);

}