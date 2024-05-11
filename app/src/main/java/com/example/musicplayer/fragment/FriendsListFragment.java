package com.example.musicplayer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.musicplayer.R;

import java.util.Arrays;
import java.util.List;

public class FriendsListFragment extends Fragment {

    private RecyclerView recyclerView;
    private LottieAnimationView lottieAnimation;

    // 模拟好友数据
    private final List<String> friends = Arrays.asList("One", "Two", "Three", "Four", "Five");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friends_list, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        lottieAnimation = view.findViewById(R.id.lottieAnimation);

        setupRecyclerView();
        simulateDataLoading();

        return view;
    }

    private void setupRecyclerView() {
        recyclerView.setAdapter(new SimpleAdapter(friends));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public void simulateDataLoading() {

        AlphaAnimation fadeOutAnimation = new AlphaAnimation(1.0f, 0.0f);
        fadeOutAnimation.setDuration(5000); // 设置动画持续时间为5秒
        fadeOutAnimation.setFillAfter(true); // 设置动画结束后保持状态
        // 为 LottieAnimationView 添加淡出动画
        lottieAnimation.startAnimation(fadeOutAnimation);


        // 延迟5秒来模拟数据加载
        lottieAnimation.postDelayed(() -> {
            lottieAnimation.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);

            AlphaAnimation fadeInAnimation = new AlphaAnimation(0.0f, 1.0f);
            fadeInAnimation.setDuration(2000); // 设置动画持续时间为2秒
            fadeInAnimation.setFillAfter(true); // 设置动画结束后保持状态
            // 为 RecyclerView 添加淡入动画
            recyclerView.startAnimation(fadeInAnimation);

        }, 5000);  // 延迟5秒



    }


}


