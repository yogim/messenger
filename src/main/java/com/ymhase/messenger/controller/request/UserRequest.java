package com.ymhase.messenger.controller.request;

import lombok.Data;

@Data
public class UserRequest {

        private String name;
        private String phoneno;

        public UserRequest(String name, String phoneno) {
                super();
                this.name = name;
                this.phoneno = phoneno;
        }

        public UserRequest() {
                super();
        }

}
