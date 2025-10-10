public class ItemForSale
{
    private Double price;
    private String name;
    private String date;

    public ItemForSale(Double cost, String tag, String day) {
        price = cost;
        name = tag;
        date = day;
    }

    public Double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
}
