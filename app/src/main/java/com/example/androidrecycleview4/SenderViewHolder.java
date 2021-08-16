package com.example.androidrecycleview4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SenderViewHolder extends RecyclerView.ViewHolder {
    private TextView mtvSendMessage;
    public SenderViewHolder(@NonNull View itemView) {
        super(itemView);
        initview(itemView);
    }

    private void initview(View itemView) {
        mtvSendMessage = itemView.findViewById(R.id.sendMg);
    }
    public void setData(SenderModel senderModel){
        mtvSendMessage.setText(senderModel.getSenderMessage());

    }
}
