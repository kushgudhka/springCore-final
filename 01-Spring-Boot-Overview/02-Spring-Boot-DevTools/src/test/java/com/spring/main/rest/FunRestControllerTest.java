package com.spring.main.rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class FunRestControllerTest {
    FunRestController funRestController = new FunRestController();

    @Test
    void testHello(){

        String result = funRestController.sayHello();
        assertEquals("Hello Kush!",result);
    }

    @Test
    void testWorkout(){
        String result = funRestController.getDailyWorkout();
        assertEquals("Run 60KM!",result);
    }

}