package com.example.test;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.Data_list.Test;

import java.util.List;
public class AdapterMain extends RecyclerView.Adapter<AdapterMain.Viewholder> {

    Context context;
    List<Test.Data> list;

    public AdapterMain(Context context, List<Test.Data> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterMain.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from( context );
        View view = layoutInflater.inflate( R.layout.data_list, parent, false );
        return new Viewholder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMain.Viewholder holder, int position) {
        Test.Data model = list.get( position );
        holder.textView.setText( model.getId().toString() );
        holder.textView1.setText( model.getReceiver().getType() );
        holder.textView1.setOnClickListener( view -> {
            Intent intent = new Intent( context, Main3Activity.class );
            context.startActivity( intent );
        } );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView textView, textView1, textView2;
        public Viewholder(@NonNull View itemView) {
            super( itemView );
            textView = itemView.findViewById( R.id.text1 );
            textView1 = itemView.findViewById( R.id.text22 );
            textView2 = itemView.findViewById( R.id.text3 );
        }
    }
}
