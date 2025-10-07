
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Book b = new Book(1.29, "Green Eggs and Ham", "2025", "Big Company", new Author("Dr. Seuss", "March 2"));
        Movie m = new Movie(999, "Clair de Lune but real", "9/9/99", 99, new Author("Debussy", "all time"));
        ItemForSale chip = new ItemForSale(0.19, "singular chip", "expired already");
        
        s.addItem(b);
        s.addItem(m);
        s.addItem(chip);
        
        System.out.println("Store: " + s);
        //System.out.println(b instanceof ItemForSale);
        ArrayList tempList = s.showItems();
        for (ItemForSale item : tempList) {
         System.out.println(item instanceof ItemForSale);
        }
        System.out.println("List End");

        s.sellItem(chip);
        System.out.println(s.showProfit());
        
        System.out.println(s.getCreator(b));
     }
}
