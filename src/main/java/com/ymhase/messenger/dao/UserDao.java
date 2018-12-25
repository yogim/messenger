package com.ymhase.messenger.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class UserDao {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "name", columnDefinition = "TEXT", nullable = false)
        private String name;

        @Column(name = "phoneNo", columnDefinition = "TEXT", nullable = false)
        private String phoneNo;

        public UserDao() {
                super();
        }

        public UserDao(int id, String name, String phoneNo) {
                super();
                this.id = id;
                this.name = name;
                this.phoneNo = phoneNo;
        }

}
