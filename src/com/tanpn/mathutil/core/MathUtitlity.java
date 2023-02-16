/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tanpn.mathutil.core;

/**
 *
 * @author Administrator
 */
public class MathUtitlity {

    public static final double PI = 3.1415;

    //Hàm tính N! = 1 x 2 x 3 x .... x N
    //Ko có giai thừa âm
    //0! = 1! = 1 quy ước
    //vì giai thừa tăng giá trị rất nhanh, 20! vừa đủ 18 số 0
    //tức là 21! tràn kiểu LONG
    //Quy ước: hàm này chỉ tính từ 0 đến 20!
    //Có 2 cách viết hàm này: for truyền thống và đệ quy - recursion
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20!!");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
