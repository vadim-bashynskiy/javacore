package com.bashynskiy.app.classwork.lesson6;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by testu on 3/21/2017.
 */

public class TimeoutTest {
    @Ignore("Not ready yet")
    @Test(timeout = 1000) // время пока выполнится наш метод если не успеет то ошибка таймаут
public void infinityTest(){
       while(true);

    }
}
