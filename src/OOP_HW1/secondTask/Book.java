package OOP_HW1.secondTask;

public class Book {
    public static void main(String[] args) {
Content content = new Content("Lorem ipsum..");
content.show();

Title title = new Title("Колись ти станеш програмістом");
title.show();

Author author = new Author("Харіс");
author.show();
    }
}
