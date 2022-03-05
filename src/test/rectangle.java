package test;

public class rectangle {
    private int longth;
    private int width;

    public int getLongth() {
        return longth;
    }

    public void setLongth(int longth) {
        this.longth = longth;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public rectangle(int longth,int width){
        this.longth=longth;
        this.width=width;
    }
    public int getArea(){
        int area=0;
        area=longth*width;
        return area;
    }
}
