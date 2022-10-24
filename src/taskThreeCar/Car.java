package taskThreeCar;

public class Car {

    double price;
    String color;

    public Car(double price, String color){
        this.price = price;
        this.color = color;
    }

    public double calculateSalePrice(){
        return this.price;
    }
}

class Sedan extends Car{
    double length;

    public Sedan(double price, String color, double length){
        super(price,color);
        this.length=length;
    }

    @Override
    public double calculateSalePrice(){
        if(this.length>20){
            return this.price*0.95;
        }else{
            return this.price*0.9;
        }
    }
}

class Truck extends Car{
    double weight;

    public Truck(double price, String color, double weight){
        super(price,color);
        this.weight=weight;
    }

    @Override
    public double calculateSalePrice(){
        if(this.weight>2000){
            return this.price * 0.9;
        }else{
            return this.price * 0.8;
        }
    }
}
class Main{
    public static void main(String[]args){
        Truck myTruck1 = new Truck(3500,"blue",1900);
        Truck myTruck2 = new Truck(3500,"black",2900);
        System.out.println(myTruck1.calculateSalePrice());
        System.out.println(myTruck2.calculateSalePrice());
        System.out.println("=============================");
        Sedan mySedan1 = new Sedan(1750,"white",16);
        Sedan mySedan2 = new Sedan(1750,"silver",21);
        System.out.println(mySedan1.calculateSalePrice());
        System.out.println(mySedan2.calculateSalePrice());

    }

}
