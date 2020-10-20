package labsheet4.exercise4;

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
        if(title==null||title.equals(""))
            this.title = "No Title Supplied!";
        else
            this.title = title;
    }
    public void setPrice(double price){
        if(price>0)
            this.price = price;
    }
    public void setISBN(String ISBN){
        if(ISBN==null||ISBN.equals(""))
            this.ISBN = "No ISBN Supplied!";
        else
            this.ISBN = ISBN;
    }
    public void setPages(int pages){
        if(pages>0&&pages<4000)
            this.pages = pages;
        else
            this.pages = 0;
    }

    public String toString(){
        return String.format("%-20s%-10.2f%-15s%-5d",
                getTitle(title),getPrice(price),getISBN(ISBN),getPages(pages));
    }

}
