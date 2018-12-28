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
import javax.persistence.Temporal;

import lombok.Data;

@Data
@Entity
@Table(name = "message")
public class Message {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "message", columnDefinition = "TEXT", nullable = false)
        private String message;

        @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
        @JoinColumn(name = "senderid", referencedColumnName = "id", nullable = false)
        private User senderid;

        @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
        @JoinColumn(name = "receiverid", referencedColumnName = "id", nullable = false)
        private User receiverid;

        @ManyToOne(targetEntity = Group.class, fetch = FetchType.LAZY)
        @JoinColumn(name = "groupid", referencedColumnName = "id", nullable = false)
        private Group groupid;

        @Column(name = "hasreceived", columnDefinition = "tinyint", nullable = false)
        private Boolean hasreceived;

        @Column
        @Temporal(javax.persistence.TemporalType.TIMESTAMP)
        private Date sendat;

        @Column
        @Temporal(javax.persistence.TemporalType.TIMESTAMP)
        private Date receivedat;

        Message() {
        }

        public Message(Integer id, String message, User senderid, User receiverid, Boolean hasreceived,
                        Date sendat, Date receivedat, Group groupid) {
                this.id = id;
                this.message = message;
                this.senderid = senderid;
                this.receiverid = receiverid;
                this.groupid = groupid;
                this.hasreceived = hasreceived;
                this.sendat = sendat;
                this.receivedat = receivedat;
        }

}
