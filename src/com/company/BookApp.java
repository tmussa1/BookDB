package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class BookApp {

    public static void main(String[] args) {
        System.out.println(bookreturner("Java1002").getTitle());
    }

    public static ArrayList<Book> getAllbooks(){
        ArrayList<Book> books = new ArrayList<>();

        Book book = new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook" ,47.50);
        Book book2 = new Book( "Java1002","Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00);
        Book book3 = new Book("Orcl1003","OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky","Everything you need to know in one place", 45.00);
        Book book4 = new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart",	"Fun with Python", 10.50);
        Book book5 = new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse","Simon Monk","Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",	16.50);
        Book book6 = new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius","Donald Norris","A dozen fiendishly fun projects for the Raspberry Pi!",	14.75);

        books.add(book);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        return books;
    }
    public static Book bookreturner(String SKU){

        for(Book book: getAllbooks()){
            if(SKU == book.getSKU()){
                return book;
            }
        }
        return null;
    }
}
