package labsheet4.exercise3;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;
    public Book(){
        this("Title Not Available",0.0,"ISBN Not Available",0);
    }
    public Book(String title, double price, String ISBN, int pages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public String getTitle(String title){
        return title;
    }
    public double getPrice(double price){
        return price;
    }
    public String getISBN(String ISBN){
        return ISBN;
    }
    public int getPages(int pages){
        return pages;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public void setPages(int pages){
        this.pages = pages;
    }

    public String toString(){
        return "Title: " + getTitle(title) + "  Price: "
                + getPrice(price) + "  ISBN: " + getISBN(ISBN) +
                "  Pages: " + getPages(pages);
    }

}
