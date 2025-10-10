
public class Book extends ItemForSale
{
    private String publisher;
    private Author creator;
    
    public Book(Double cost, String tag, String day, String pub, Author author) {
        super(cost, tag, day);

        publisher = pub;
        creator = author;
    }

    public String getPublisher(){
        return publisher;
    }
    public Author getAuthor(){
        return creator;
    }
    
}
