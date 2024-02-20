package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {
    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book( 1,"Book1", 50, "author1");
        Book book2 = new Book( 2,"Book2", 150, "author2");
        Book book3 = new Book( 3,"Book3", 350, "author3");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Product[] expected = {book1, book2, book3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testMatches() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book( 1,"Book1", 50, "author1");
        Book book2 = new Book( 2,"Book2", 150, "author2");
        Book book3 = new Book( 3,"Book3", 350, "author3");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Product[] expected = {book3};
        Product[] actual = manager.searchBy("3");

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testMatchesNo() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book( 1,"Book1", 50, "author1");
        Book book2 = new Book( 2,"Book2", 150, "author2");
        Book book3 = new Book( 3,"Book3", 350, "author3");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Product[] expected = {};
        Product[] actual = manager.searchBy("Book8");

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testAddFirst() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book( 1,"Book1", 50, "author1");
        Book book2 = new Book( 2,"Book2", 150, "author2");
        Book book3 = new Book( 3,"Book3", 350, "author3");
        Smartphone smartphone1 = new Smartphone( 4,"Iphone", 60000, "Apple");
        Smartphone smartphone2 = new Smartphone( 5,"Galaxy", 55000, "Samsung");

        manager.add(book1);
        manager.add(book3);
        manager.add(smartphone2);
        manager.add(smartphone1);

        Product[] expected = {smartphone2};
        Product[] actual = manager.searchBy("Galax");

        Assertions.assertArrayEquals(expected,actual);
    }

}
