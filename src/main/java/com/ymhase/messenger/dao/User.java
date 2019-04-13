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
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "name", columnDefinition = "TEXT", nullable = false)
        private String name;

        @Column(name = "phoneno", columnDefinition = "TEXT", nullable = false)
        private String phoneNo;

        public User() {
        }

        public User(Integer id, String name, String phoneNo) {
                this.id = id;
                this.name = name;
                this.phoneNo = phoneNo;
        }

}
