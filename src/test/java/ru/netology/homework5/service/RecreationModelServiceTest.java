package ru.netology.homework5.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RecreationModelServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/test_data.csv")
    public void shouldCalc(long income, long expense, long threshold, int expected) {
        RecreationModelService service = new RecreationModelService();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
