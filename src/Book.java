public class Book {

    public char size;
    public int red;
    public int green;
    public int blue;
    public String shape;

    public Book (char pSize, int pRed, int pGreen, int pBlue, String pShape) {
        size = pSize;
        red = pRed;
        green = pGreen;
        blue = pBlue;
        shape = pShape;
    }
    public void printInfo(){
        System.out.println("the book is size" + size);
        System.out.println("the book is a" + shape );
        
    }
}
