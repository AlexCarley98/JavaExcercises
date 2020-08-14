package com.qa;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.qa.day2.Calculator;
import com.qa.day4.calculator;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     *
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void additionAdds(){
        assertEquals(10, Calculator.addition(5,5));
        assertEquals(0, Calculator.subtraction(5,5));
        assertEquals(4,Calculator.division(8,2),0);
        assertEquals(25,Calculator.multiplication(5,5));
    }

    @Test
    public void testcalculator(){
        calculator calc = new calculator();
        assertEquals("2.0/4.0*6.0=3.0",calculator.calc1(2,4,6,3) );
        assertEquals("1.0*1.0+2.0=3.0",calculator.calc1(1,1,2,3) );
        assertEquals("4.0/4.0+3.0=4.0",calculator.calc1(4,4,3,4) );
        assertEquals("8.0/4.0*3.0=6.0",calculator.calc1(8,4,3,6) );
        assertEquals("9.0-3.0+1.0=7.0",calculator.calc1(9,3,1,7 ) );


    }
}
