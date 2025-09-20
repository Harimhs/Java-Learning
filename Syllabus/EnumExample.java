package Syllabus;

enum Size {
    SMALL(30), MEDIUM(40), LARGE(50); 
    private int price; 
    Size(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Size pizzaSize = Size.LARGE;
        System.out.println("Pizza size: " + pizzaSize);
        System.out.println("Price: " + pizzaSize.getPrice());
    }
}
