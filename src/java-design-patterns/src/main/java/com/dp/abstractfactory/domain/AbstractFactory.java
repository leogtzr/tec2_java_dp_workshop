package com.dp.abstractfactory.domain;

public interface AbstractFactory<T> {
    T create(String type);
}

