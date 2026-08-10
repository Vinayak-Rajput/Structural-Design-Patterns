package com.example.structure.Bridge.AbstractReport;

import com.example.structure.Bridge.SenderInterface.Sender;

public abstract class Report {
    protected final Sender sender;

    public Report(Sender sender) {
        this.sender = sender;
    }

    public abstract void send();
}
