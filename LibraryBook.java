public class LibraryBook { 
    int bookId; 
    String title; 
    String author; 
    
    static String libraryName = "Baripada Library"; 
    static int totalBooks = 0; 

    LibraryBook(int bookId, String title, String author) { 
        this.bookId = bookId; 
        this.title = title; 
        this.author = author; 
        totalBooks++; 
    } 
    
    void display(){
        System.out.println("\n--------------------------");
        System.out.println("Book Id : " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Library Name : " + libraryName);
        System.out.println("\n--------------------------");
    }

    static void displayLibrary(){
        System.out.println("\n--------------------------");
        System.out.println("Library Name : " + libraryName);
        System.out.println("Total Book : " + totalBooks);
    }
    public static void main(String[] args) {
        LibraryBook l1 = new LibraryBook(450, "Yajnaseni", "Pratibha Ray");
        LibraryBook l2 = new LibraryBook(451, "Praja", "Gopinath Mohanty");
        LibraryBook l3 = new LibraryBook(452, "Chha Mana Atha Guntha", "Fakir Mohan Senapati");

        l1.display();
        l2.display();
        l3.display();

        LibraryBook.displayLibrary();
    }
}

