package cwpack;

public class ADisplayTest extends ADisplay {

    int firstNum;
    int secondNum;

    // constructor
    public ADisplayTest(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public void display() {
        System.out.println("This class extends 'ADisplay'. It's two integer instance variables are " + firstNum + " " + "and" +  " " + secondNum);
    }
    
    
    public static void main(String[] args) {
        
        ADisplay test = new ADisplayTest(1, 2);
        test.display();
    }

}
