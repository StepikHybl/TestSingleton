package com.company;

public class CarBuilder {
    double engine;
    String color;
    String wheels;

    public CarBuilder addEngine(double engine){
        this.engine = engine;
        return this;
    }

    public CarBuilder addColor(String color){
        this.color = color;
        return this;
    }

    public CarBuilder addWheels(String wheels){
        this.wheels = wheels;
        return this;
    }

    public Car build(){
        if((engine == 0) || (color == null || color.isEmpty()) || (wheels == null || wheels.isEmpty())){
            throw new IllegalArgumentException("Vse musi byt vyplneno");
        }
        return new Car(engine,color,wheels);
    }
}
