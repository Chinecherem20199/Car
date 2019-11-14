package com.company;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4679;
    boolean isCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double minFuel = 8;
    double mpg = 26.4;

    int minNumOfPeopleInCar = 1;
    int maxNumOfPeopleInCar = 6;

    public Car(){

    }
    public Car(int customMaxSpeed, double customWeight, boolean customIsCarOn){
        this.maxSpeed = customMaxSpeed;
        this.weight = customWeight;
        this.isCarOn = customIsCarOn;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isCarOn() {
        return isCarOn;
    }

    public void setCarOn(boolean carOn) {
        isCarOn = carOn;
    }

    public char getCondition() {
        return condition;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public double getMinFuel() {
        return minFuel;
    }

    public void setMinFuel(double minFuel) {
        this.minFuel = minFuel;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public int getMinNumOfPeopleInCar() {
        return minNumOfPeopleInCar;
    }

    public void setMinNumOfPeopleInCar(int minNumOfPeopleInCar) {
        this.minNumOfPeopleInCar = minNumOfPeopleInCar;
    }

    public int getMaxNumOfPeopleInCar() {
        return maxNumOfPeopleInCar;
    }

    public void setMaxNumOfPeopleInCar(int maxNumOfPeopleInCar) {
        this.maxNumOfPeopleInCar = maxNumOfPeopleInCar;
    }

    public void printVariable(){
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println("This is the weight " + weight);
        System.out.println(isCarOn);
        System.out.println(minSpeed);
        System.out.println(condition);
        System.out.println(nameOfCar);
//        System.out.println(maxFuel);
//        System.out.println(minFuel);
        System.out.println(minNumOfPeopleInCar);
//        System.out.println(maxNumOfPeopleInCar);
    }
    public void upgradeMMaxpeed(){
        setMaxSpeed(getMaxSpeed() + 10);
    }
    public void getIn(){
        if (minNumOfPeopleInCar < maxNumOfPeopleInCar){
            minNumOfPeopleInCar ++ ;
            System.out.println("Someone got in");
        }else {
            System.out.println("the car is already full " + minNumOfPeopleInCar + "" + maxNumOfPeopleInCar);
        }
    }
    public  void getOut(){
        if (this.minNumOfPeopleInCar > 0){
            minNumOfPeopleInCar --;
        }
    }
    public double howManyMilsTillOutOfGas(){
        return minFuel * mpg;
    }
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public void turnTheCarOn(){
        if (!isCarOn){
            isCarOn = true;
        }
    }
    public static void main(String[] args) {

        Car birthdayCar = new Car(500,5000.545, true);
        System.out.println("Birthday car v1");
        birthdayCar.printVariable();
        birthdayCar.getIn();
        birthdayCar.getIn();
        birthdayCar.getIn();

        System.out.println("Miles left " + birthdayCar.howManyMilsTillOutOfGas());
        System.out.println("Max Mile left " + birthdayCar.maxMilesPerFillUp());
        System.out.println("Birthday Car v2");
        birthdayCar.printVariable();
        birthdayCar.getOut();
        System.out.println("Birthday Car v3");
        birthdayCar.printVariable();
        birthdayCar.turnTheCarOn();
    }
}
