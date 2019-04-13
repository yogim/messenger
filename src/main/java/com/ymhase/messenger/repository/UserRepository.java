package com.ymhase.messenger.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ymhase.messenger.dao.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
