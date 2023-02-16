/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tanpn.mathutil.main;

import com.tanpn.mathutil.core.MathUtitlity;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        //Dân Dev phải có trách nhiệm tes code của mình chạy đúng hay sai 
        //trước khi lắp ráp nó với các class khác để tạo nên các chức năng
        //Có nhiều quy tắc đặt ten ehafm cho việc kiểm thử hàm
        //ví dụ hàm dưới này sẽ dùng để test cái hàm tính giai thừa
        //trong tình huống - case đưa nd dúng chuẩn, thì ta hy vọng - expected
        //hàm chạy ngon như thiết kế, ví dụ n = 5 thì hàm phải trả về 120
        //tức là 5! hy vọng hàm tính ra 120
        
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongArugmentThrowException();
    }
    //Thiết kế hàm getF() là: chỉ tính n! từ 0..20
    //Nếu đưa n < 0 hoặc n > 20 thi HÀM SẼ KO TÍNH, CHỬI = CÁCH NÉM RA NGOẠI LỆ
    
    //thực tế hàm getF() khi chạy có làm được như thiết kế hay ko thì phải test thử, chạy thử mới biết được
    public static void testFactorialGivenWrongArugmentThrowException() {
        //Test Case #4: test getF() with n = -5; wrong argument
        //Expected value: an exception is thrown
        //      IllegalArgumentException
        System.out.println("Test -5!: expected = Illegal Argument Exception is thrown");
        MathUtitlity.getFactorial(-5);
    }
    public static void testFactorialGivenRightArgumentRunsWell() {
        //Test Case #1: Test get Factorial with n = 0
        //Expected value: 1 - hy vọng đưa n = 0 vào thì hàm trả về 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtitlity.getFactorial(n);
        
        
        System.out.println("Test " + n + "!: expected = " + expectedValue
                                           + " | actual: " + actualValue );
        
        //Test case #2: Test getFactorial() with n = 1
        //Expected value = 1 - hy vong 1! app sẽ trả về 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtitlity.getFactorial(n); //thực tế app chạy
        System.out.println("Test " + n + "!: expected = " + expectedValue
                                           + " | actual: " + actualValue );
        
        //Test case #3: Test getFactorial() with n = 3
        //Expected value = 6 - hy vong 3! app sẽ trả về 6
        n = 3;
        expectedValue = 6;
        actualValue = MathUtitlity.getFactorial(n); //thực tế app chạy
        System.out.println("Test " + n + "!: expected = " + expectedValue
                                           + " | actual: " + actualValue );
        
        
    }
    
}
