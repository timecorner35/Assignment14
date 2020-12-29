package assignment14;

public class Q8Value {
    int value;
    int count;
    Q8Value(int value){
        this.value = value;
    }
    Q8Value(){

    }
    public void setVal(int i){
         value = i;
         count++;

    }
    public boolean wasModified(){
         return count==0 ?false : true;
    }
    public int getVal(){
        return value;

    }
}
