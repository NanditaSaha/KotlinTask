package com.app.kotlinbasic.interoperability;

public class CalculateSum {

    public int sumResult(int[] nums)
    {
        int mResult = 0;
        for (int x:nums) {
            mResult+=x;
        }
        return mResult;
    }
}
