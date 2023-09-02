package Pizza.intefaces;

import Pizza.Base.Topping;

import java.util.ArrayList;
import java.util.List;

public class PizzaBase implements IPreparable {

    private String nombre; // Nombre de la pizza
    private double precio; // Precio de la pizza

    private List<Topping> toppings = new ArrayList<>();

    public PizzaBase(String nombre, double precio, Topping... toppings) {
        this.nombre = nombre;
        this.precio = precio;
        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }
    @Override
    public void prepare()
    {
        System.out.println("La pizza se esta preparando");
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void calcularPrecioTotal(){
        double precioTotal = 0;
        if (toppings != null){
            for (Topping ingrediente : toppings) {

                precioTotal += ingrediente.getPrecio();
            }
            precioTotal = precioTotal + precio;
            if (precioTotal > 0)
            {
                System.out.println("El costo a pagar es: " + precioTotal);
            }
        }
    }

}
