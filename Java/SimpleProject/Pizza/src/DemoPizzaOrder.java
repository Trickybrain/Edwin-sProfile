
public class DemoPizzaOrder {

	public static void main(String[] args) 
	{
		//creating object
		Pizza pizza1 = new Pizza("large",1,0,1);
		Pizza pizza2 = new Pizza("medium",2,2,0);
		PizzaOrder order = new PizzaOrder();
		//inputing info
		order.setNumPizzas(1); // 2 pizzas in the order
		order.setPizza1(pizza1); // Set first pizza
		order.setPizza2(pizza2); // Set second pizza
		double total = order.calcTotal(); // Should be 18+20 = 38
		//display the summary
		System.out.println(pizza1.getDescription());
		System.out.println(pizza2.getDescription());
		System.out.println("Total cost: $" + total);
	}//end main

}//end class
