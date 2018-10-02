package com.zilla;

/**
 * @author zilla0148
 */
public abstract class BaseClock {
    int utcOffset;

    /**
     * fetch time
     * @return int
     */
    public abstract int getTime();
}
