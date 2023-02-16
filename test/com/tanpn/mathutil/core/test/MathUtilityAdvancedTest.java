/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tanpn.mathutil.core.test;

import com.tanpn.mathutil.core.MathUtitlity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Object[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 60},
            {4, 24},
            {5, 120}
        };
    }
        
    //Cot 0
    @Parameterized.Parameter(value = 0)
    public int n;
    
    //Cot 1
    @Parameterized.Parameter(value = 1)
    public long expectedValue;
    
    @Test
    public void testFactorialGivenRightAgrumentReturnWells() {
        assertEquals(expectedValue, MathUtitlity.getFactorial(n));
    }
            
    
}
