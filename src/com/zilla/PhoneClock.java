package com.zilla;

/**
 * @author zilla0148
 */
public class PhoneClock extends BaseClock {
    private int time;
    private HotelWorldClockSystem hotelWorldClockSystem;

    public PhoneClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    @Override
    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
        if(this.hotelWorldClockSystem == null) {
            return;
        }
        for(CityClock cityClock : this.hotelWorldClockSystem.getCityClocks()){
            cityClock.setUtcZeroTime( time - super.utcOffset );
        }
    }
}
