package assignment14;

public class Q5TV {
    int channel ;
    int volumeLevel ;
    boolean on ;
    String brand ;

    public Q5TV() {
        System.out.println("Creating TV object using no Args- constructor");
         channel = 1;
         volumeLevel = 1;
         on = false;
         brand = "undefined";

    }

    public Q5TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if((volumeLevel>0&&volumeLevel<8)&&on )  this.volumeLevel = volumeLevel;
        else System.out.println("ERROR: TV is either OFF or invalid Volume level");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel>0&&channel<121){ this.channel = channel;}
        else System.out.println("ERROR: TV is either OFF or invalid Channel");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp() {
        if(channel==120|on == false){ System.out.println("ERROR: TV is either OFF or invalid Channel");
            return;}
        else channel++;
    }

    public void channelDown() {
        if(channel==1|on == false){ System.out.println("ERROR: TV is either OFF or invalid Channel");
            return;}
        channel--;
    }

    public void volumeUp() {
        if (volumeLevel==7|on==false){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
            return;
        }
        else volumeLevel++;
    }

    public void volumeDown() {
        if (volumeLevel==1|on==false){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
            return;
        }
        else volumeLevel--;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        if (on) System.out.println("\"TV is already ON");
        else on = true;
    }

    public void turnOff() {
        if(!on) System.out.println("TV is already OFF");
        else on = false;

    }
}