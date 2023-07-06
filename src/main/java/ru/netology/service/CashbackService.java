package ru.netology.service;
public class CashbackService {
    private final int boundary = 1000;
    int remain;

    public int remain(int amount) {
        remain = boundary - amount % boundary;

    return remain;
    }

}