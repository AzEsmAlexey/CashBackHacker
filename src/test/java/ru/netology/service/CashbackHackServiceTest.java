package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void testPurchaseLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int purchase = 800;

        int expected = 200;
        int actual = service.remain(purchase);

        assertEquals(actual, expected);
    }
    @Test
    public void testPurchaseMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int purchase = 1550;

        int expected = 450;
        int actual = service.remain(purchase);

        assertEquals(actual, expected);
    }
    @Test
    public void testPurchaseEquals1000() {
        CashbackHackService service = new CashbackHackService();
        int purchase = 1000;

        int expected = 0;
        int actual = service.remain(purchase);

        assertEquals(actual, expected);
    }


}