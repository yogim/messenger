package com.ymhase.messenger.controller.request;

import lombok.Data;

@Data
public class MessageRequest {

        private String message;
        private int receiverId;
        private int senderId;

        public MessageRequest() {

        }

        public MessageRequest(int receiverId, String message, int senderId) {
                super();
                this.receiverId = receiverId;
                this.message = message;
                this.senderId = senderId;
        }

}
