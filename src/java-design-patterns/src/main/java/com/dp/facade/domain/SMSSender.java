package com.dp.facade.domain;

public interface SMSSender {
    void readConfiguration();
    void validateConfiguration();
    void startServer();
    void sendMessage(String msg, String phoneNumber);
    void freeResources();
    void shutdown();
}
