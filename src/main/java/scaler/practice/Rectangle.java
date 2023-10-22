package scaler.practice;

public class Rectangle {
    // Define properties here
    private int length;
    private int width;

    // Define constructor here
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    int perimeter(){
        // Complete the function
        return 2*(length+width);
    }
    int area(){
        // Complete the function
        return width*length;
    }
}
