package restaurant;

public class MenuItem {
        private String name;
        private String category;
        private String description;
        private double price = 0.0;
        boolean isNew = true;

        //Constructors, getters and setters should be public. Just the variable would be private
        //Constructors
        public MenuItem(String name, String category, String description, double price){
            this.name = name;
            this.category = category;
            this.description = description;
            this.price = price;
        }
        //getters and setters
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getCategory(){
            return category;
        }
        public void setCategory(String category){
            this.category = category;

        }
        public String getDescription(){
            return description;
        }
        public void setDescription(String description){
            this.description = description;
        }
        public double getPrice(){
            return price;
        }
        public void setPrice(Double price){
            this.price = price;
        }
        public String isNewOrNot() {
            return "New Item!!!";
        }
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("MenuItem:");
        sb.append("name = ").append(name);
        sb.append(",price = ").append(price);
        sb.append(",category =").append(category);
        return sb.toString();
    }
}
