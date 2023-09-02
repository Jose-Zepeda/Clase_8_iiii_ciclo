package Pizza.especialidades;
import Pizza.Base.Pizza;
import Pizza.Base.Topping;

public class PizzaItaliana extends Pizza{
    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    private String salsa;
    public PizzaItaliana(String name, double price, String salsa, Topping... toppings) {
        super(name,price,toppings);
        this.salsa = salsa;
    }
}
