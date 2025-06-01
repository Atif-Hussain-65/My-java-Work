public class Square
{
    private double side;
    Square (){}
    Square(double side){
        this.side=side;
    }
    public double getArea(){
        return this.side*this.side;
    }
}
