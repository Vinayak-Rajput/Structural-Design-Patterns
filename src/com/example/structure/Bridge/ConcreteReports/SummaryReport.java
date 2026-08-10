package com.example.structure.Bridge.ConcreteReports;

import com.example.structure.Bridge.AbstractReport.Report;
import com.example.structure.Bridge.SenderInterface.Sender;

public class SummaryReport extends Report {
    public SummaryReport(Sender sender){
        super(sender);
    }
    @Override
    public void send() {
        sender.sendMessage("Quarterly Summary Report");
    }
}
