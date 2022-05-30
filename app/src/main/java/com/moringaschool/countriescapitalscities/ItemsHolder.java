package com.moringaschool.countriescapitalscities;

public class ItemsHolder {
    //declare our variables
    private int image;
    private String country;
    private String capital;

    public ItemsHolder(int image, String country, String capital) {
        this.image = image;
        this.country = country;
        this.capital = capital;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
