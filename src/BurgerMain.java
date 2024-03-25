public class BurgerMain {
    public static void main(String[] args) {
        Burger burger1 = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез");
        Burger burger2 = new Burger("булочка", "м'ясо", "сир", "зелень");
        Burger burger3 = new Burger("булочка", "м'ясо", "сир", "зелень", true);
        System.out.println("Звичайний бургер:");
        burger1.display();
        System.out.println("\nДієтичний бургер:");
        burger2.display();
        System.out.println("\nБургер з подвійним м'ясом:");
        burger3.display();
    }
}