package com.example.knitterassignment.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.knitterassignment.MyRepo;
import com.example.knitterassignment.R;
import com.example.knitterassignment.di.NetworkComponent;
import com.example.knitterassignment.model.Result;
import com.example.knitterassignment.model.User;

import java.util.List;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class FetchResultsActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    Call<User> myRepoList;
    MyRepo myRepo;
    NetworkComponent networkComponent;
    @Inject Retrofit retrofit;
    RepoListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetchresults);
        ((App) getApplication()).getComponent().inject(this);

        MyRepo myRepo = retrofit.create(MyRepo.class);
        myRepoList = myRepo.getUsers();

        myRepoList.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                System.out.println();
            }
        });


    }

    private void generateDataList(User photoList) {
        recyclerView = findViewById(R.id.recycler_view);
        //adapter = new RepoListAdapter(this,photoList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public class RepoListAdapter extends RecyclerView.Adapter<RepoListAdapter.RepoViewHolder>{


        private List<Result> data;
        private Context context;

        RepoListAdapter(Context context, List<Result> list) {

            this.context = context;
            this.data = list;
            setHasStableIds(true);
        }

        @NonNull
        @Override
        public RepoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.view_repo_list_item, parent, false);
            return new RepoViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RepoViewHolder holder, int position) {
            holder.bind(data.get(position));
        }

        @Override
        public int getItemCount() {
            return data.size();
        }


        class RepoViewHolder extends RecyclerView.ViewHolder {

            TextView firstName;
            TextView lastName;


            RepoViewHolder(View itemView) {
                super(itemView);
                firstName = itemView.findViewById(R.id.first_name);
                lastName = itemView.findViewById(R.id.last_name);
            }

            void bind(Result result) {
                firstName.setText(result.getFirst_name());
                lastName.setText(result.getLast_name());
            }
        }
    }

}
