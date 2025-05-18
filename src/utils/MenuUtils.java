package utils;

import java.util.Scanner;

import models.Book;
import models.Library;

public class MenuUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu(Library library) {
        int option;
        do {
            System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Emprestar livro");
            System.out.println("4. Devolver livro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            option = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer
            
            switch (option) {
                case 1:
                    registerBook(library);
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    borrowBook(library);
                    break;
                case 4:
                    returnBook(library);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 0);
    }

    private static void registerBook(Library library) {
        System.out.println("\n=== CADASTRAR LIVRO ===");
        System.out.print("Título: ");
        String title = scanner.nextLine();
        
        System.out.print("Autor: ");
        String author = scanner.nextLine();
        
        System.out.print("Ano: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        
        Book newBook = new Book(title, author, year);
        library.addBook(newBook);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void borrowBook(Library library) {
        System.out.println("\n=== EMPRESTAR LIVRO ===");
        System.out.print("Digite o título do livro: ");
        String title = scanner.nextLine();
        library.borrowBook(title);
    }

    private static void returnBook(Library library) {
        System.out.println("\n=== DEVOLVER LIVRO ===");
        System.out.print("Digite o título do livro: ");
        String title = scanner.nextLine();
        library.returnBook(title);
    }
}
