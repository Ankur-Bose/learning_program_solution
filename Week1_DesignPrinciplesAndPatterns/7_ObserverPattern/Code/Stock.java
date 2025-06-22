// Subject 

interface Stock {
    
    public void register(Observer ob);
    public void deregister(Observer ob);
    public void notifyStock(String stockName);
}