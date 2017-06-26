package com.example.konda.grossingfilms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView movielist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movielist = (RecyclerView) findViewById(R.id.movielist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        movielist.setLayoutManager(layoutManager);

        CustomAdapter adapter = new CustomAdapter(Data.getData());
        movielist.setAdapter(adapter);
    }

    public static class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.DataViewHolder> {
        List<Data> dataList;

        CustomAdapter(List<Data> dataList) {
            this.dataList = dataList;

        }

        @Override
        public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, null);
            return new DataViewHolder(view);
        }

        @Override
        public void onBindViewHolder(DataViewHolder holder, int position) {
            Data data = dataList.get(position);

            holder.title.setText(data.title);
            holder.distributor.setText(data.distributor);
            holder.gross.setText("$" + data.gross);

        }

        @Override
        public int getItemCount() {
            return dataList.size();
        }

        static class DataViewHolder extends RecyclerView.ViewHolder {


            TextView title;
            TextView distributor;
            TextView gross;


            public DataViewHolder(View itemView) {
                super(itemView);

                title = (TextView) itemView.findViewById(R.id.title);
                distributor = (TextView) itemView.findViewById(R.id.distributor);
                gross = (TextView) itemView.findViewById(R.id.gross);


            }
        }


    }
}
