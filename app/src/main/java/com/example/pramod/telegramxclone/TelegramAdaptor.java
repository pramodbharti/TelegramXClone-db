package com.example.pramod.telegramxclone;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by pramod on 6/4/18.
 */

public class TelegramAdaptor extends FragmentPagerAdapter {

    private Context mContext;
    public TelegramAdaptor(Context context,FragmentManager fm)
    {
        super(fm);
        mContext=context;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new ChatFragment();
            default:
                return new CallFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return mContext.getString(R.string.category_chats);
            default:
                return mContext.getString(R.string.category_calls);
        }
    }
}
