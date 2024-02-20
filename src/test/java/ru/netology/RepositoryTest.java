package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    private Repository repository = new Repository();
    Product product = new Product(1, "test", 500);
    @Test
    public void addTest() {
        repository.add(product);

        Assertions.assertEquals(1, repository.findAll().length);
    }

    @Test
    public void findAllTest(){
        repository.add(product);
        repository.add(product);
        assertEquals(2, repository.findAll().length);
    }
}