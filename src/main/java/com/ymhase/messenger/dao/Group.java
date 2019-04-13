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
@Table(name = "groupm")
public class Group {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        private Integer id;

        @Column(name = "name", nullable = true)
        private String name;

        public Group() {
        }

        public Group(Integer id, String name) {
                this.id = id;
                this.name = name;
        }

}
