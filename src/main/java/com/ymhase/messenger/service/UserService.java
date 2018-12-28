package com.ymhase.messenger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ymhase.messenger.controller.request.UserRequest;
import com.ymhase.messenger.dao.User;
import com.ymhase.messenger.repository.UserRepository;

@Service
@Transactional
@Component
public class UserService {

        @Autowired
        private UserRepository userRepo;

        public void registerUser(UserRequest userRequest) {

                User userDao = new User();
                userDao.setName(userRequest.getName());
                userDao.setPhoneNo(userRequest.getPhoneno());
                userRepo.save(userDao);
        }

}
