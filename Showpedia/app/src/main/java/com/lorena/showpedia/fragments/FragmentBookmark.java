package com.lorena.showpedia.fragments;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lorena.showpedia.R;
import com.lorena.showpedia.adapters.bookmark.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FragmentBookmark extends Fragment {
    //widget
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private ViewPager2 viewPager;

    static int currItem= 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bookmark_main, container, false);
        //viewPager settings
        viewPager = rootView.findViewById(R.id.view_pager);
        viewPagerAdapter = new ViewPagerAdapter(getActivity());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setOffscreenPageLimit(2);
        viewPager.getAdapter().notifyDataSetChanged();
        viewPager.setCurrentItem(currItem);

        //tablayout settings
        tabLayout = rootView.findViewById(R.id.tabs);
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> tab.setText("OBJECT " + (position + 1))
        ).attach();
        //set text of tab layout
        (tabLayout.getTabAt(0)).setText("Películas");
        (tabLayout.getTabAt(1)).setText("Series");

        return rootView;
    }
}