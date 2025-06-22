public class MobileApp implements Observer{
    private final String stock;
    MobileApp(String stock){
        this.stock = stock;
    }
    @Override
    public void update(String name){
        System.out.println("This message is for mobile users");
        System.out.println("Greetings "+name+ " the price of Stock "+this.stock+ " is changing soon ");
    }
}
