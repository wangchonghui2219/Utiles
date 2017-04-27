package com.example.utileslibrary.ALiPay;

/**
 *支付结果返回接口
 */
public interface PayResultInterface {
    /**
     *
     * @param resultStatus 0支付成功，1支付失败
     */
    public abstract void setResultlistener(int resultStatus);

}
