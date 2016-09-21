package com.menuorder.api.persistence.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.menuorder.api.persistence.entity.User;
import com.menuorder.api.persistence.repo.UserRepo;
import com.menuorder.api.persistence.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	public User saveOrUpdate(User user) {
		User savedUser = new User();

		try {
			savedUser = userRepo.save(user);
		} catch (Exception e) {
			System.out.println("Error while saving user : " + e.getMessage());
		}

		return savedUser;
	}

}
