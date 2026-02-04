class Book {
    private boolean isAvailable = true;

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    void returnBook() {
        isAvailable = true;
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.borrowBook();
        System.out.println("Borrowed");
    }
}
