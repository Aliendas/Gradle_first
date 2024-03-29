package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackServiceTest {

    @org.testng.annotations.Test
    public void CalculateCashback() {
        CashbackService service = new CashbackService();
        int amount = 3300;
        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void CalculateNullCashback() {
        CashbackService service = new CashbackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    void CalculateLowCashback() {
        CashbackService service = new CashbackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void CalculateBigCashback() {
        CashbackService service = new CashbackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void CalculateEqualCashback() {
        CashbackService service = new CashbackService();
        int amount = 4000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}

