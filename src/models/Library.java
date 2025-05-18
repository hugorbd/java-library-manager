package models;

import java.util.ArrayList;

public class Library {
     private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        
        System.out.println("\n=== LIVROS CADASTRADOS ===");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    System.out.println("Livro já está emprestado.");
                } else {
                    book.setBorrowed(true);
                    System.out.println("Livro emprestado com sucesso!");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.setBorrowed(false);
                    System.out.println("Livro devolvido com sucesso!");
                } else {
                    System.out.println("Este livro já está disponível.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}
