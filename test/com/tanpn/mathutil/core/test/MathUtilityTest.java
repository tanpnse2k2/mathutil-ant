/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tanpn.mathutil.core.test;

import com.tanpn.mathutil.core.MathUtitlity;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Administrator
 */
public class MathUtilityTest {
   
    @Test
    //Trong hàm này sẽ chứa các test case để test getF()
    //với n hiowj kệ trong khoảng 0..20
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1: test getF() with n = 0
        //Expected result = 1; hy vọng 0! = 1   
       int n = 0;
       long expectedValue = 1; //hy vọng 0! = 1
       long actualValue = MathUtitlity.getFactorial(n); //thực tế getF() trả về mấy???
       
        Assert.assertEquals(expectedValue, actualValue);
               
        //Test case #2: test getF() with n - 5;
        // Expected result = 120; hy vọng 5! = 120
        n = 5;
        expectedValue = 120;
        actualValue = MathUtitlity.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);
        
        //Test case #3: test getF() with n = 6;
        // Expected result = 720; hy vọng 6! = 720
        n = 6;
        expectedValue = 720;
        actualValue = MathUtitlity.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);
        
        
        //Test case #4: test getF() with n = 4;
        // Expected result = 24; hy vọng 4! = 24
        n = 4;
        expectedValue = 24;
        actualValue = MathUtitlity.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);
            
    }
   
    
}
