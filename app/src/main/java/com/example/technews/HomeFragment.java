package com.example.technews;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.technews.Adapters.HomeFragmentNewsAdapter;
import com.example.technews.Data.TopNews;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    Context mCtx;
    RecyclerView mTopNewsRecycler;
    HomeFragmentNewsAdapter adapter;
    List<TopNews> topNewsList;

    public HomeFragment(Context mCtx) {
        this.mCtx = mCtx;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mTopNewsRecycler = view.findViewById(R.id.top_news_recycler);
        mTopNewsRecycler.setLayoutManager(new LinearLayoutManager(mCtx));
        mTopNewsRecycler.setHasFixedSize(true);

        topNewsList = new ArrayList<>();

        topNewsList.add(new TopNews("Title"));
        topNewsList.add(new TopNews("Title"));
        topNewsList.add(new TopNews("Title"));
        topNewsList.add(new TopNews("Title"));
        topNewsList.add(new TopNews("Title"));
        topNewsList.add(new TopNews("Title"));

        adapter = new HomeFragmentNewsAdapter(mCtx, topNewsList);
        mTopNewsRecycler.setAdapter(adapter);

        return view;
    }
}
