package test.com.zilla;

import com.zilla.CityClock;
import com.zilla.HotelWorldClockSystem;
import com.zilla.PhoneClock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * @author zilla0148
 * @version 1.0
 * User Story: 作为一位酒店大堂服务员，
 *         * 我想在大堂的城市时钟不准时，用设置自己手机时间的方法，
 *         * 自动统一调整城市时钟的时间，来避免逐一调整这些时钟的繁琐工作。
*/

public class HotelWorldClockTest {
    private HotelWorldClockSystem hotelWorldClockSystem;
    private PhoneClock phoneClock;

    @Before
    public void initSystem(){
        this.hotelWorldClockSystem = new HotelWorldClockSystem();
        //phoneClock时区为东八，与北京一致
        this.phoneClock = new PhoneClock(8);
    }

    @Test
    public void the_time_of_clock_Beijing_should_be_9_after_the_phone_clock_is_set_to_9_Beijing_time(){
        //Arrange
        CityClock beijingClock = new CityClock(8);
        hotelWorldClockSystem.addClock(beijingClock);

        //Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        //Assert
        assertEquals(9,beijingClock.getTime());
    }

    @Test
    public void the_time_of_clock_London_should_be_0_after_the_phone_clock_is_set_to_8_Beijing_time() {
        // Arrange
        CityClock londonClock = new CityClock(0);
        hotelWorldClockSystem.addClock(londonClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(8);

        // Assert
        assertEquals(0, londonClock.getTime());
    }

    @Test
    public void the_time_of_clock_NewYork_should_be_19_after_the_phone_clock_is_set_to_8_Beijing_time() {
        // Arrange
        CityClock newYorkClock = new CityClock(-5);
        hotelWorldClockSystem.addClock(newYorkClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(8);

        // Assert
        assertEquals(19, newYorkClock.getTime());
    }

    @Test
    public void the_time_of_clock_Moscow_and_NewYork_should_be_1_and_20_respectively_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock moscowClock = new CityClock(4);
        CityClock newYorkClock = new CityClock(-5);
        hotelWorldClockSystem.addClock(moscowClock);
        hotelWorldClockSystem.addClock(newYorkClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        //(9-8+4) mod 24 = 5     (9-8-5) mod 24 = 20
        assertEquals(5, moscowClock.getTime());
        assertEquals(20, newYorkClock.getTime());
    }

    @Test
    public void the_time_of_the_phone_clock_should_be_set_correctly_after_its_setTime_method_is_invoked() {
        // Arrange
        // Act
        phoneClock.setTime(23);

        // Assert
        assertEquals(23, phoneClock.getTime());
    }

    @Test
    public void the_time_of_clock_Sidney_should_be_12_after_the_phone_clock_is_set_to_10_Beijing_time() {
        // Arrange
        CityClock sidneyClock = new CityClock(10);
        hotelWorldClockSystem.addClock(sidneyClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(10);

        // Assert
        assertEquals(12, sidneyClock.getTime());
    }
}
