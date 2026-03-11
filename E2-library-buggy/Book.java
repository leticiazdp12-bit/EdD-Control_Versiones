// Book.java
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }
    

    //getters and setters
    public String getTitle() {  return title;   }
    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {return author;}
     public void setAuthor(String author) {
        this.author = author;
    }


    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public boolean isAvailable() {return available;}
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    //metodos de la clase
    //prestamos
    public void borrow() {
       if (!available) {
            System.out.println("El libro ya está prestado");
            return;
        }
        available = false;
        System.out.println("Libro prestado correctamente.");
    }
    
    //devoluciones de libros
    public void returnBook() {
        if (available) {
            System.out.println("El libro ya estaba disponible.");
            return;
        }
        available = true;
        System.out.println("Libro devuelto correctamente.");
    }


    
    }

