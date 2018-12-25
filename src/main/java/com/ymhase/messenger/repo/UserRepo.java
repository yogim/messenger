package com.ymhase.messenger.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ymhase.messenger.dao.UserDao;

@Repository
public interface UserRepo extends CrudRepository<UserDao, Integer> {

}
