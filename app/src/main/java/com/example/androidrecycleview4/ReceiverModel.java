package com.example.androidrecycleview4;

public class ReceiverModel extends BaseModel{
    public String getReceiverMessage() {
        return ReceiverMessage;
    }

    private String ReceiverMessage;

    public ReceiverModel(String receiverMessage) {
        ReceiverMessage = receiverMessage;
    }

    @Override
    int getViewType() {
        return 1;
    }
}
