package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    @Test
    public void searchBy() {
        Manager manager = new Manager();
        manager.add(product);
        manager.add(item2);
        manager.add(item3);
        manager.searchBy(Samsung);

        Product[] expected = {item2};
        Product[] actual = manager.searchBy();

        Assertions.assertArrayEquals(expected, actual);

    }
}
