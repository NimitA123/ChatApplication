package com.example.androidrecycleview4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<BaseModel> baseModelArrayList= new ArrayList<>();
    public ChatAdapter(ArrayList<BaseModel> baseModelArrayList){
        this.baseModelArrayList = baseModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch(viewType){
            case 0:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.send_item_layout, parent, false);
                return new SenderViewHolder(view);
            case 1:
                View view1= LayoutInflater.from(parent.getContext()).inflate(R.layout.receiver_item_layout, parent, false);
                return new ReceiverViewHolder(view1);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = baseModelArrayList.get(position).getViewType();
        switch(viewType){
            case 0:
                if(holder instanceof SenderViewHolder){
                    SenderModel senderModel = (SenderModel) baseModelArrayList.get(position);
                   ((SenderViewHolder)holder).setData(senderModel);
                }
                break;

        case 1:
        if(holder instanceof ReceiverViewHolder){
            ReceiverModel receiverModel = (ReceiverModel) baseModelArrayList.get(position);
            ((ReceiverViewHolder)holder).setData(receiverModel);
        }
        break;
    }

    }

    @Override
    public int getItemViewType(int position) {
        /*** this method is responsible which layout will be inflate in on create method*********/
        return baseModelArrayList.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        return baseModelArrayList.size();
    }
}
