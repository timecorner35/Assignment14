package assignment14;

public class Q12CameraPhone extends Q12Phone {
    int imageSize,memorySize;

    public Q12CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures(){

        return memorySize*1000/imageSize;
    }
}




