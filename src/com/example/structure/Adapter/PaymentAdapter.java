package com.example.structure.Adapter;

public class PaymentAdapter implements PaymentProcessor{
    private ThirdPartyVendorSDK sdk;

    public PaymentAdapter(ThirdPartyVendorSDK sdk){
        this.sdk = sdk;
    }

    @Override
    public void pay(double dollar) {
        System.out.println("Paying using 3rd party ");
        int cents = (int) (dollar * 100);
        sdk.sendPayments(cents,"$");
    }
}
