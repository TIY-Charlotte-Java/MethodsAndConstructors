package com.theironyard.charlotte;

/**
 * Created by Joe on 11/30/16.
*/
public class Book {
        String name;
        String author;
        String color;
        int pages;

        public Book(String bookName, String bookAuthor, String bookColor, int bookPages) {
                name = bookName;
                author = bookAuthor;
                color = bookColor;
                pages = bookPages;
        }

        public String getName() {
                return name;
        }

        public String getAuthor() {
                return author;
        }

        public String getColor() {
                return color;
        }

        public int getPages() {
                return pages;
        }

        public void setName(String newName) {
                name = newName;
        }

        public void setAuthor(String newAuthor) {
                author = newAuthor;
        }

        public void setColor(String newColor) {
                color = newColor;
        }

        public void setPages(int newPages) {
                if (pages <= 1000) {
                        pages = newPages;
                        if (pages > 1000)
                                System.out.println("I ain't got the time dude.");
                }
        }
}