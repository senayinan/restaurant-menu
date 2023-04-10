package restaurant;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Greek Salad", "Healthy Choices", 5,"Salad",true);
        MenuItem item2 = new MenuItem("Greek Salad", "Healthy Choices", 5,"Salad",true);
        MenuItem item3 = new MenuItem("Cake","Sweets", 9,"Dessert", true);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);
        myMenu.removeMenuItem(item3);
        /*System.out.println(myMenu.toString());

        System.out.println(myMenu.toString());
        System.out.println(item1.toString());*/

    }
}
