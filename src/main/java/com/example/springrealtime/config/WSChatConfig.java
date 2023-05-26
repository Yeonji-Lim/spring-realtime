package com.example.springrealtime.config;
import com.example.springrealtime.handler.WSChatHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@RequiredArgsConstructor
@EnableWebSocket // WebSocket 활성화
public class WSChatConfig implements WebSocketConfigurer {

    private final WSChatHandler WSChatHandler;

    @Bean
    public WebSocketHandler webSocketHandler() {
        return new WSChatHandler();
    }
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(WSChatHandler, "ws/wschat").setAllowedOrigins("*");
    }
}