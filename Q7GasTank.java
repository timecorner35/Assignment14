package assignment14;

public class Q7GasTank {

    double amount=0;
    double capacity;
    public void GasTank(double capacity){
        this.capacity = capacity;
    }
    public void addGass(double d){
        if (d+amount>=capacity)amount=capacity;
        else amount+=d;
    }
    public void useGass(double d){
        if (amount-d<=0)amount=0;
        else amount-=d;
    }
    public boolean isEmpty(){
        return amount < 0.1 ? true : false;
    }
    public boolean isFull(){
        return amount>capacity-0.1 ? true : false;
    }
    public double getGasLevel(){
        return amount;
    }
    public double fillUp(){
        return capacity-amount;
    }


}
