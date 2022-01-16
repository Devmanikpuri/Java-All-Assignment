package com.org.gen.day4;

class Car{
    String carType;
    String carName;
    public Car(String carType, String carName) {
        super();
        this.carType = carType;
        this.carName = carName;
    }
    private String getCarName() {
        return this.carName;
    }
    class Engine{
        String enginType;
        void setEngine() {
            if(Car.this.carType.equals("abcd")) {
                if(Car.this.getCarName().equals("Crysler")) {
                    this.enginType="smaller";

                }else {
                    this.enginType="Bigger";
                }
                }else {
                    this.enginType="tooBig";
            }
        }String getEnginType(){
            return this.enginType;
        }
    }
}

public class NonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("Mazda" , "4wd");
		//create obj of inner class using the outer class
		Car.Engine eng = c.new Engine();
		eng.setEngine();
		System.out.println("Engin type for 4wd "+eng.getEnginType());
		 
		Car c2 = new Car("Crysler" , "8wd");
		Car.Engine eng1 = c2.new Engine();
		eng1.setEngine();
		System.out.println("Engin type for 4wd "+eng1.getEnginType());

		 

	}

}
