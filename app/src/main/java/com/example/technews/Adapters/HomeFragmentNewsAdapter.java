package com.example.technews.Adapters;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.technews.Data.TopNews;
import com.example.technews.R;

import java.util.List;

public class HomeFragmentNewsAdapter extends RecyclerView.Adapter<HomeFragmentNewsAdapter.HomeFragmentNewsViewHolder> {

    Context mCtx;
    List<TopNews> topNewsList;

    public HomeFragmentNewsAdapter(Context mCtx, List<TopNews> topNewsList) {
        this.mCtx = mCtx;
        this.topNewsList = topNewsList;
    }

    @NonNull
    @Override
    public HomeFragmentNewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.news_card, parent, false);
        HomeFragmentNewsViewHolder holder = new HomeFragmentNewsViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeFragmentNewsViewHolder holder, int position) {
        TopNews topNews = topNewsList.get(position);
        holder.mNewsTitle.setText(topNews.getTitle());
        Glide.with(mCtx).load(topNews.getImageUrl()).placeholder(R.drawable.images1).into(holder.mThumbnail);
    }

    @Override
    public int getItemCount() {
        return topNewsList.size();
    }

    class HomeFragmentNewsViewHolder extends RecyclerView.ViewHolder {

        TextView mNewsTitle;
        ImageView mThumbnail;
        public HomeFragmentNewsViewHolder(@NonNull View itemView) {
            super(itemView);
            mNewsTitle = itemView.findViewById(R.id.news_card_title);
            mThumbnail = itemView.findViewById(R.id.topNewsThumbnail);
        }
    }
}
