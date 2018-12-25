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
public class MessageDao {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "message", columnDefinition = "TEXT", nullable = false)
        private String message;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user", referencedColumnName = "id", nullable = false)
        private int senderId;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user", referencedColumnName = "id", nullable = false)
        private int receiverId;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "group", referencedColumnName = "id", nullable = false)
        private int groupid;

        @Column(name = "hasreceived", columnDefinition = "tinyint", nullable = false)
        private int hasreceived;

        @Temporal(javax.persistence.TemporalType.TIMESTAMP)
        private Date sendat;
        
        @Temporal(javax.persistence.TemporalType.TIMESTAMP)
        private Date receivedat;
        
        

        MessageDao() {
        }



        public MessageDao(int id, String message, int senderId, int receiverId, int groupid, int hasreceived,
                        Date sendat, Date receivedat) {
                super();
                this.id = id;
                this.message = message;
                this.senderId = senderId;
                this.receiverId = receiverId;
                this.groupid = groupid;
                this.hasreceived = hasreceived;
                this.sendat = sendat;
                this.receivedat = receivedat;
        }

       

}
