package com.example.springrealtime.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class WSChatController {
    @GetMapping("/wschat")
    public String getChat() {
        log.info("@WebsocketController, chat GET()");
        return "wschat";
    }
}