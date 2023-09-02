import Pizza.Base.Pizza;
import Pizza.Base.Topping;
import Pizza.especialidades.PizzaItaliana;
import Pizza.intefaces.PizzaBase;


public class Main {
    public static void main(String[] args)
    {

        /*Pizza pizza = new Pizza("Pizza Margherita", 10.99);
        pizza.addTopping(new Topping("Tomato"));
        pizza.addTopping(new Topping("Mozzarella"));
        pizza.addTopping(new Topping("Basil"));
        pizza.removeTopping("1");
        pizza.prepare();

        PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Italiana", 10.99, "Salsa de tomate");
        pizzaItaliana.addTopping(new Topping("Tomato"));
        pizzaItaliana.addTopping(new Topping("Mozzarella"));
        pizzaItaliana.addTopping(new Topping("Basil"));
        pizzaItaliana.prepare();
        System.out.println("Salsa:"+pizzaItaliana.getSalsa());*/

        Pizza pizza = new Pizza("Pizza Base", 5);
        pizza.addTopping(new Topping("Tomato", 10));
        pizza.addTopping(new Topping("Mozzarella", 15));
        pizza.addTopping(new Topping("Basil", 20));
        System.out.println(pizza.getPizzaPrice());
    }
}
