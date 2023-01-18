package Lessons.Lesson4.services;

import Lessons.Lesson4.entity.Book;

public class BookUtil {

    public Book createBook(){
        Book newBook = new Book();
        return newBook;
    }

    public Book createBookWithAuthorAndName(String author, String name){
        Book newBook = new Book(author,name);
        return newBook;
    }

    public Book createBookWithAllParameters(String author, String name, int pages, String catalogNumber, boolean isInStorage){
        Book newBook = new Book(author,name,pages, catalogNumber,isInStorage);
        return newBook;
    }

    public void editBookCatalogNumber(Book ourBook,String newCatalogNumber){
        ourBook.setCatalogNumber(newCatalogNumber);
    }

}