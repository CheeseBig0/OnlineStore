public class Movie extends ItemForSale
{
    private Double duration;
    private Author author;

    public Movie(Double cost, String tag, String day, Double length, Author creator) {
        super(cost, tag, day);

        duration = length;
        author = creator;
    }

    public getDuration() {
        return duration;
    }
    public getAuthor(){
        return author;
    }
}
