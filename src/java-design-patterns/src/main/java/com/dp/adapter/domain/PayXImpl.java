package com.dp.adapter.domain;

public class PayXImpl implements PayX {

    private String creditCardNo;
    private String customerName;

    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public void setCreditCardNo(final String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public void setCustomerName(final String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "PayXImpl{" +
                "creditCardNo='" + creditCardNo + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
