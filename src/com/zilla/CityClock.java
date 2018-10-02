package com.zilla;

/**
 * @author zilla0148
 */
public class CityClock extends BaseClock {
    private int utcZeroTime;

    public CityClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    @Override
    public int getTime() {
        return (super.utcOffset + this.utcZeroTime + 24) % 24;
    }

    void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
