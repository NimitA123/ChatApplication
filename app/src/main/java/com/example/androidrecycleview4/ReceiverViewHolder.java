package com.example.androidrecycleview4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReceiverViewHolder extends RecyclerView.ViewHolder {
    private TextView mtvReceiver;
    public ReceiverViewHolder(@NonNull View itemView) {
        super(itemView);
        init(itemView);
    }

    private void init(View itemView) {
        mtvReceiver = itemView.findViewById(R.id.receiverMsg);

    }
    public void setData(ReceiverModel receiverModel){
        mtvReceiver.setText(receiverModel.getReceiverMessage());

    }

}
