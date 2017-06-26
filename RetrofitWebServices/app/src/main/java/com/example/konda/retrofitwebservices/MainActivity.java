package com.example.konda.retrofitwebservices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listview1);

        RestApi restApi=BaseURL.getApi();
        Call<Details> detailsCall =restApi.getAllValues();
        detailsCall.enqueue(new Callback<Details>() {
            @Override
            public void onResponse(Call<Details> call, Response<Details> response) {
                if(response.isSuccessful()&&response.body()!=null){
                    Details details1=response.body();
                    CustomAdapter adapter=new CustomAdapter(details1.getContactsList());
                    listView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<Details> call, Throwable t) {
                Toast.makeText(MainActivity.this, "hello bad url", Toast.LENGTH_SHORT).show();

            }
        });
    }
    public class CustomAdapter extends BaseAdapter{
        List<Contacts> contactsList;

        CustomAdapter(List<Contacts> contactsList ){
           this.contactsList=contactsList;
       }
        @Override
      public int getCount() {
            return contactsList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView=getLayoutInflater().inflate(R.layout.info,null);
            TextView name=(TextView)convertView.findViewById(R.id.textView);
            TextView email=(TextView)convertView.findViewById(R.id.textView2);
            TextView mobile=(TextView)convertView.findViewById(R.id.textView3);

            Contacts contacts=contactsList.get(position);
            name.setText(contacts.getName());
            email.setText(contacts.getEmail());
            mobile.setText(contacts.getPhone().getMobile());


            return convertView;
        }
    }
}
