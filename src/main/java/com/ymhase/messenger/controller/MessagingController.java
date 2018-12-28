package com.ymhase.messenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ymhase.messenger.controller.request.UserRequest;
import com.ymhase.messenger.service.UserService;

@RestController()
public class MessagingController {

        @Autowired
        UserService userService;

        @RequestMapping(value = "/subscribe", method = RequestMethod.POST)
        public void registerUser(@RequestParam UserRequest userRequest) {
                userService.registerUser(userRequest);
        }

}
