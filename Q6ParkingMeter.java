package assignment14;

public class Q6ParkingMeter {
    int timeLeft=0;
    int maxTime;

    public Q6ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }
    public boolean add(int i){
        if (timeLeft<=maxTime&&i==25) {
            timeLeft+=30;
            return true;
        }
        else return false;
    }
    public void tick(){
        if(timeLeft>0){
            timeLeft-=1;
        }
    }
    public boolean isExpired(){

        if (timeLeft==0){return true;}
        else return false;
    }
}


