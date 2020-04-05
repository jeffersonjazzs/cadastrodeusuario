package br.com.itimagine.springmvc.dao;

import java.util.List;

import br.com.itimagine.springmvc.model.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();

	UserProfile findByType(String type);

	UserProfile findById(int id);
}
