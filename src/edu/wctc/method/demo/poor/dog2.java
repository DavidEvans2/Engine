package edu.wctc.method.demo.poor;

public class dog2 {
    private int age;

    public dog2(int age){
        validateAge(age);
        this.age = age;
    }

    public void chaseMailCarrier(){
        startRunning();
        navigateToMailCarrier();
        closeGapToMailCarrier();
    }

    private void closeGapToMailCarrier(){
        System.out.println("Closing gap");

    }
    private void startRunning(){

    }

    private void navigateToMailCarrier(){

    }

    public void setAge(int age){
        validateAge(age);
        this.age = age;
    }

    private void validateAge(int age){
        if (age < 0){
            throw new IllegalArgumentException("Age can't be a negative");
        }
    }
}
