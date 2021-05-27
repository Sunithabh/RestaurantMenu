package restaurant;
import java.util.Calendar;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Welcome to Our Restaurant Menu");
        System.out.println("------------------------------");

        //to add item to the MenuItem list, create an instance method and add item1, item2 and so on.
        MenuItem appetizerItem1 = new MenuItem("Chicken Lollipop","appetizer",
                "Chicken on the bone.",10.49);
        MenuItem appetizerItem2 = new MenuItem("Vegetable Samosa","appetizer",
                "A fried pastry with a savory potato filling.",8.99);
        MenuItem appetizerItem3 = new MenuItem("Curry Leaves Chicken","appetizer",
                "Fried chicken covered in bread crumbs",11.99);
        MenuItem appetizerItem4 = new MenuItem("Gobi manchurian", "appetizer",
                "Deep fried cauliflower sauted with ginger garlic spices,dry red chillies and cashews.",10.99);
        MenuItem EntreeItem1 = new MenuItem("Chicken Chettinadu","Entree",
                "Chicken sauees and cooked in mild sauce and spices in chettinad style.Srved with rice.",14.99);
        MenuItem EntreeItem2 = new MenuItem("Paneer Tikka Masala","Entree",
                "Indian cottege cheese cooked in a creamy tomato sauce." +
                        "Served with indian native spices.Served with rice.",13.99);
        MenuItem EntreeItem3 = new MenuItem("Kadai Chicken","Entree",
                "Boneless chicken, sauteed tomatoes,onions and " +
                        "green peppers cooked in a mild sauce.Served with rice.",14.99);
        MenuItem EntreeItem4 = new MenuItem("Navrathan Korma","Entree",
                "Gentle blend of mixed vegetables,cashews and light cream." +
                        "Served with indian native spices.served with rice",13.99);
        MenuItem DessertItem1 = new MenuItem("Gulab Jamun","Desserts","",5.99);
        MenuItem DessertItem2 = new MenuItem("Rasmalai","Desserts","",5.99);

        //create an instance method and add the items in the newMenu
        Menu menu = new Menu();
        menu.addMenu(appetizerItem1);
        menu.addMenu(appetizerItem2);
        menu.addMenu(appetizerItem3);
        menu.addMenu(appetizerItem4);
        menu.addMenu(EntreeItem1);
        menu.addMenu(EntreeItem2);
        menu.addMenu(EntreeItem3);
        menu.addMenu(EntreeItem4);
        menu.addMenu(DessertItem1);
        menu.addMenu(DessertItem2);

        System.out.println(menu.listAllItems());
        System.out.println(menu.findItem("Chicken Lollipop"));

        Calendar now = Calendar.getInstance();
        System.out.println();
        System.out.println("Menu updated on : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE)
                + "-" + now.get(Calendar.YEAR));
        System.out.println();

    }
}
