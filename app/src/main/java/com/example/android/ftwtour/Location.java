package com.example.android.ftwtour;
/* Custom Class code adapted from Miwok app, supplemented by code from a Medium article by Nikhil Bansal
 * https://medium.com/mindorks/custom-array-adapters-made-easy-b6c4930560dd*/
public class Location {

    private String name;
    private String description;
    private String address;
    private int imageResourceId;


    Location(String name, String description, String address, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {

        return getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getImageResourceId();
    }
}
