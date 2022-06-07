package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.model.Concatenate;

class ConcatenateTest {

    @Test
    public void testConcatenate() {
    	Concatenate concatenate = new Concatenate();

        String result = concatenate.concatenate("one", "two");

        assertEquals("onetwo", result);

    }

}
