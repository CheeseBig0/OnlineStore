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

    public getPrice() {
        return price;
    }
    public getName() {
        return name;
    }
    public getDate() {
        return date;
    }
}
