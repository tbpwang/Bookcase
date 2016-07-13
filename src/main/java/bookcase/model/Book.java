package bookcase.model;

import java.io.Serializable;

/**
 * Administrator
 * Created by tbpwang
 * 2016/7/13.
 */
public class Book implements Serializable{
    private    int id;
    private String title;
    private String author;
    private String printDate;
    private double price;
    private    int amount;

    public Book() {
    }

    public Book(int id, String title, String author, String printDate, double price, int amount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.printDate = printDate;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrintDate() {
        return printDate;
    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", printDate='" + printDate + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
