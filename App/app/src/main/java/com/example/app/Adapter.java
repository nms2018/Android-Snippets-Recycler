package com.example.app;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private List<ModelClass> myDataSource;
    private ImageView imageView;
    private TextView title;
    private TextView body;



    public Adapter(List<ModelClass> myDataSource) {
        this.myDataSource = myDataSource;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int resource  = myDataSource.get(position).getImageResoruce();
        String title = myDataSource.get(position).getTitle();
        String body = myDataSource.get(position).getBody();
        holder.setData(resource,title,body);
    }

    @Override
    public int getItemCount() {
        return myDataSource.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            title = itemView.findViewById(R.id.textView);
            body = itemView.findViewById(R.id.body);
        }
        private void setData(int resource, String titleText, String bodyText){
            imageView.setImageResource(resource);
            title.setText(titleText);
            body.setText(bodyText);
        }
    }



}
