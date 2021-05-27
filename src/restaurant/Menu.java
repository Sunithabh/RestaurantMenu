package restaurant;
import java.util.ArrayList;

public class Menu {
    // instantiate
    private ArrayList<MenuItem> menu = new ArrayList<>();


    //constructor
    public Menu(){
        // looping through all items in MenuItems taken from presentMenu
// looping through all items in MenuItems taken from presentMenu
        for(MenuItem item : menu){
            menu.add(item);
        }
    }

    //methods
    public void addMenu(MenuItem item) {
        if(item != null){
            menu.add(item);
        } if(item != null){
            menu.add(item);
        }
    }
    public void removeMenu(String name){
        if(name == null || menu == null || menu.size() == 0){
            return;
        }
        for(MenuItem itemInItem : menu){
            if(name.equalsIgnoreCase(itemInItem.getName())) {
                menu.remove(itemInItem);
                return;
            }
        }
        System.out.println("item with name "+ name + " not found");
    }
    public MenuItem findItem(String name) {
        if(name == null || menu == null || menu.size() == 0){
            return null;
        }
        for(MenuItem itemInItem : menu){
            if(name.equalsIgnoreCase(itemInItem.getName())){
                return itemInItem;
            }
        }
        return null;
    }
    public ArrayList<MenuItem> listAllItems(){
        for(int i =0; i< menu.size(); i++){
            System.out.println(menu.get(i));
        }
        return menu;
    }
}

