package library;

public class Book {
    private String id;
    private String name;
    private String author;
    private int year;

    public Book(String id, String name, String author, int year){
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString(){
        return "ID" + id + "| name" + name + "| author" + author + "| year" + year;
    }
}