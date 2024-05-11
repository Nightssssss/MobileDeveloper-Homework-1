package com.example.musicplayer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.musicplayer.fragment.FriendsListFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull AppCompatActivity activity) {
        super(activity);
    }

    @Override
    public int getItemCount() {
        return 2; // 可以在这里修改添加更多的 Tab
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new FriendsListFragment();
    }
}
