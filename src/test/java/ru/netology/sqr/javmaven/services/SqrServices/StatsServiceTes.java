package ru.netology.sqr.javmaven.services.SqrServices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.javmaven.services.SQRService;

public class StatsServiceTes {
    @Test
    public void summaSale(long[] sales) {
        SQRService service = new SQRService();
        long[] Array = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.summaSales(Array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSale(long[] sales) {
        SQRService service = new SQRService();
        long[] Array = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSales(Array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSale(long[] sales) {
        SQRService service = new SQRService();
        long[] Array = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(Array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSale(long[] sales) {
        SQRService service = new SQRService();
        long[] Array = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(Array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void underAverageSale(long[] sales) {
        SQRService service = new SQRService();
        long[] Array = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.underAverageSales(Array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overAverageSale(long[] sales) {
        SQRService service = new SQRService();
        long[] Array = {8, 16, 13, 15, 17, 19, 19, 20, 7, 14, 14, 18};
        long expected = 6;
        long actual = service.overAverageSales(Array);
        Assertions.assertEquals(expected, actual);
    }
}
