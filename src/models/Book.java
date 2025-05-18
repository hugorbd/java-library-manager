package models;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
    }

    // Getters e Setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isBorrowed() { return borrowed; }
    
    public void setBorrowed(boolean borrowed) { this.borrowed = borrowed; }

    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s | Ano: %d | Status: %s",
                title, author, year, borrowed ? "Emprestado" : "Disponível");
    }
    
}
