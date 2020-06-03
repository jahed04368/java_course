package Udemy.Section6OOPS;

public class Walls {
    private double width;
    private double height;

    public Walls() {
        this.width = width;
        this.height = height;
    }
    public Walls(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){

         if (width<0){
             this.width=0;
         }else {
             this.width=width;
         }
    }

    public void setHeight(double height) {
        if (height<0){
            this.height=0;
        }else {
            this.height = height;
        }
    }

    public double getArea(){
        return this.width*this.height;
    }
}
