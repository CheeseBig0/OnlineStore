
public class Book extends ItemForSale
{
    private String publisher;
    private Author creator;
    
    public Book(Double cost, String tag, String day, String pub, Author author) {
        super(cost, tag, day);

        publisher = pub;
        creator = author;
    }

    public getPublisher(){
        return publisher;
    }
    public getAuthor(){
        return creator;
    }

}
