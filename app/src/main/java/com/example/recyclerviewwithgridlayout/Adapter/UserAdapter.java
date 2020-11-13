package com.example.recyclerviewwithgridlayout.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewwithgridlayout.Model.User;
import com.example.recyclerviewwithgridlayout.R;

import java.util.List;
import java.util.zip.Inflater;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private Context context;
    private List<User> userList;

    public UserAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<User> userList){
        this.userList = userList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_user_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        User user = userList.get(position);
        if(user == null)
            return;

        holder.img_user.setImageResource(user.getImgSource());
        holder.txt_user_name.setText(user.getUserName());


    }

    @Override
    public int getItemCount() {
        if(userList != null)
            return userList.size();
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView img_user;
        private TextView txt_user_name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img_user = itemView.findViewById(R.id.img_user);
            txt_user_name = itemView.findViewById(R.id.txt_user_name);
        }
    }
}
