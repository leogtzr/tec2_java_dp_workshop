package com.dp.singleton.factory.domain;

public class Configuration {

    private Configuration() {}

    // TODO: fix this ...
    private static Configuration sc = null;

    // TODO: fix this ...
    public static Configuration getInstance() {
        return sc;
    }
}
