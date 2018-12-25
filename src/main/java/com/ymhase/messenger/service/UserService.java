package com.ymhase.messenger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymhase.messenger.controller.request.UserRequest;
import com.ymhase.messenger.dao.UserDao;
import com.ymhase.messenger.repo.UserRepo;

@Service
public class UserService {

        @Autowired
        UserRepo userRepo;

        public void registerUser(UserRequest userRequest) {
       
                UserDao userDao = new UserDao();
                userDao.setName(userRequest.getName());
                userDao.setPhoneNo(userRequest.getPhoneno());
                userRepo.save(userDao);
        }

        
        
}
