package com.ymhase.messenger.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name = "groupmap")
public class GroupMapDao {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "group", referencedColumnName = "id", nullable = false)
        private int groupid;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user", referencedColumnName = "id", nullable = false)
        private int memberid;

        public GroupMapDao() {
                super();
        }

        public GroupMapDao(int id, int groupid, int memberid) {
                super();
                this.id = id;
                this.groupid = groupid;
                this.memberid = memberid;
        }

}
