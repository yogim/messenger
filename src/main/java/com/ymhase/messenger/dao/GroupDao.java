package com.ymhase.messenger.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "group")
public class GroupDao {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "name")
        private String name;

        public GroupDao() {
                super();
        }

        public GroupDao(int id, String name) {
                super();
                this.id = id;
                this.name = name;
        }

}
