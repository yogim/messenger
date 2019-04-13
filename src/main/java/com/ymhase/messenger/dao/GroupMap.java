package com.ymhase.messenger.dao;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

//@Data
//@Entity
//@Table(name = "groupmap")
public class GroupMap {

//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

//        @ManyToOne(targetEntity = Group.class, fetch = FetchType.LAZY)
//        @JoinColumn(name = "groupid", referencedColumnName = "id", nullable = false)
        private Group groupid;

//        @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
//        @JoinColumn(name = "memberid", referencedColumnName = "id", nullable = false)
        private User memberid;

        public GroupMap() {
        }

        public GroupMap(Integer id, Group groupid, User memberid) {
                this.id = id;
                this.groupid = groupid;
                this.memberid = memberid;
        }

}
