import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car{
    private String carID;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carID,String brand,String model,double basePricePerDay){
        this.carID=carID;
        this.brand=brand;
        this.basePricePerDay=basePricePerDay;
        this.isAvailable=true;
    }

    public String  getCarId(){
        return carID;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public double CalculatePrice(int rentalDays){
        return basePricePerDay*rentalDays;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void rent(){
        isAvailable=false;
    }

    public void returnCar(){
        isAvailable=true;
    }


}

class Customer{
    private String customerId;
    private String name;

    public Customer (String customerId,String name){
        this.customerId=customerId;
        this.name=name;
    }

    public String getCustomerId(){
        return customerId;
    }

    public String getName(){
        return name;
    }
}

class Rental{
    private Car car;
    private Customer customer;
    private int days;

    public Rental (Car car,Customer customer,int days){
        this.car=car;
        this.customer=customer;
        this.days=days;
    }

    public Car getCar(){
        return car;
    }

    public Customer getCustomer(){
        return customer;
    }

    public int getDays(){
        return days;
    }

}
