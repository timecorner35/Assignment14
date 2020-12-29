package assignment14;

class Q3Db {
private String s ;
private int i ;


    public void insertData(String s, int i) {

        this.s = s;
        this.i = i;
    }

    public String getData() {
        return s;
    }

    public int getYint() {
        return i;
    }

    public void setData(String zzz) {
       this.s = zzz;
    }

    public void setYint(int j) {
        this.i = j;
    }

}