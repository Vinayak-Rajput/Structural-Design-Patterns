package com.example.structure.Adapter;

public class ThirdPartyVendorSDK {
    public void sendPayments(int cents, String currencyCode){
        System.out.println("Sending " + currencyCode + cents + " using 3rd Party Payment Processor");
    }
}
