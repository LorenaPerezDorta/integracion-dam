package com.lorena.showpedia.adapters.bookmark;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.lorena.showpedia.fragments.TabTvBookmark;
import com.lorena.showpedia.fragments.TabMovieBookmark;

import org.jetbrains.annotations.NotNull;

public class ViewPagerAdapter extends FragmentStateAdapter {
    // attribute
    private final Fragment[] fragments;

    public ViewPagerAdapter(@NonNull @NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        //instance fragments2 favorite

        fragments = new Fragment[]{
                new TabMovieBookmark(),
                new TabTvBookmark()
        };
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        return fragments[position];
    }

    @Override
    public int getItemCount() {
        return fragments.length;
    }


}
