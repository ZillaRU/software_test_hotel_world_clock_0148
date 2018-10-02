package com.zilla;

import java.util.ArrayList;

/**
 * @author zilla0148
 */
public class HotelWorldClockSystem {
    private ArrayList<CityClock> cityClocks = new ArrayList<>();

    public void addClock(CityClock cityClock){
        this.cityClocks.add( cityClock );
    }

    ArrayList<CityClock> getCityClocks() {
        return cityClocks;
    }
}
