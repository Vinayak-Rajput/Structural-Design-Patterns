package com.example.structure.Bridge.ConcreteReports;

import com.example.structure.Bridge.AbstractReport.Report;
import com.example.structure.Bridge.SenderInterface.Sender;

public class DetailedAuditReport extends Report {
    public DetailedAuditReport(Sender sender){
        super(sender);
    }
    @Override
    public void send() {
        sender.sendMessage("Detailed Audit Report");
    }
}
