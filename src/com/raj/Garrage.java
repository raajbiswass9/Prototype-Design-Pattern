package com.raj;
import java.util.ArrayList;

public class Garrage implements Cloneable{
    private String garageName;
    ArrayList<String> cars = new ArrayList<String>();

    public Garrage() {
        this.cars = new ArrayList<String>();
    }

    public Garrage(ArrayList<String> list) {
        this.cars = list;
    }

    public Object clone() throws CloneNotSupportedException{
//		return super.clone();  //Shallow cloning

        //Deep cloning
        ArrayList<String> tempList = new ArrayList<String>();

        for(String s : this.getCars()) {
            tempList.add(s);
        }

        return new Garrage(tempList);
    }

    //Garage Name
    public String getGarageName() {
        return garageName;
    }
    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    //Amount of cars
    public ArrayList<String> getCars() {
        return cars;
    }

    public void setCars() {
        for(int i = 0; i < 5; i++) {
            cars.add(garageName+"-"+i);
        }
    }

    public void removeCars(int id) {
        cars.remove(id);
    }
}
