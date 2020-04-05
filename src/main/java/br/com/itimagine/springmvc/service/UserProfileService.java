package br.com.itimagine.springmvc.service;

import java.util.List;

import br.com.itimagine.springmvc.model.UserProfile;

public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);

	List<UserProfile> findAll();

}
