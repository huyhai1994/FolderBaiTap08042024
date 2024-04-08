package rectangle;

public class Rectangle {
    int width;
    int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getAreaRectangle(){
        return this.width * this.height;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getPerimeterRectangle(){
        return this.width*2 + this.height*2;
    }
}
