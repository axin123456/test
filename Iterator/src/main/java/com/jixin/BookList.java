package com.jixin;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> list;
    private int index;

    public BookList() {
        list = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        list.add(book);
    }

    public void deleteBook(Book book) {
        int indexOf = list.indexOf(book);
        list.remove(indexOf);
    }

    public boolean hasNext() {
        if (index >= list.size()) {
            return false;
        }
        return true;
    }

    public Book getBook() {
        return list.get(index++);
    }
}
