import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {

    List<Observer> observer = new ArrayList<>();
    @Override
    public void register(Observer ob) {
        observer.add(ob);
    }

    @Override
    public void deregister(Observer ob) {
        observer.remove(ob);
    }

    @Override
    public void notifyStock(String stockName) {
        for(Observer ob : this.observer){
            ob.update(stockName);
        }
    }
}
