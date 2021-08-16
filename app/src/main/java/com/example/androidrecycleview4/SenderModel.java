package com.example.androidrecycleview4;

public class SenderModel extends BaseModel{
    public String getSenderMessage() {
        return SenderMessage;
    }

    private String SenderMessage;

    public SenderModel(String senderMessage) {

        SenderMessage = senderMessage;
    }

    @Override
    int getViewType() {
        return 0;
    }
}
