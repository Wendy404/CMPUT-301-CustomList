package com.example.simpleparadox.listycity;

public class City {
    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof City)) {
            return false;
        }

        City c = (City) o;
        return this.getCityName().equals(c.getCityName())
                && this.getProvinceName().equals(c.getProvinceName());
    }
}
