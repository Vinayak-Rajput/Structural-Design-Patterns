package com.example.structure.Bridge.ConcreteSenders;

import com.example.structure.Bridge.SenderInterface.Sender;

public class SMSSender implements Sender {
    @Override
    public void sendMessage(String text) {
        System.out.println("SMS Text: "+ text);
    }
}
