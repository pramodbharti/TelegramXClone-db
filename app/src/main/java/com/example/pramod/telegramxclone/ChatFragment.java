package com.example.pramod.telegramxclone;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pramod on 5/4/18.
 */

public class ChatFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chat_list, container, false);

        final List<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Mohit","Hi, What's up?","12:00 AM",R.drawable.family_older_brother));
        chats.add(new Chat("Suraj","Kya hal hai?","9:00 AM",R.drawable.family_younger_brother,123));
        chats.add(new Chat("Riya","Hello","5 Mar",R.drawable.family_older_sister));
        chats.add(new Chat("Ashish","Happy Birthday, db","5 Mar",R.drawable.family_grandfather));
        chats.add(new Chat("Golu","Hi, What's up?","3 Feb",R.drawable.family_older_brother,13));
        chats.add(new Chat("Anand","Hi, What's up?","10:10 AM",R.drawable.family_older_brother));
        chats.add(new Chat("Anurag","Hi, What's up?","Jan 11",R.drawable.family_older_brother));
        chats.add(new Chat("Vishal Sinha","Hi, What's up?","12:00 AM",R.drawable.family_older_brother,133));
        chats.add(new Chat("Rahul","Hi, What's up?","12:00 AM",R.drawable.family_older_brother));
        chats.add(new Chat("Virendra Kumar","Hi, What's up?","12:00 AM",R.drawable.family_older_brother));
        chats.add(new Chat("Ankit Raj","Hi, What's up?","12:00 AM",R.drawable.family_older_brother));
        chats.add(new Chat("Khushi","Hi, What's up?","12:00 AM",R.drawable.family_older_brother));
        chats.add(new Chat("Krishna","Hi, What's up?","12:00 AM",R.drawable.family_older_brother,5));
        chats.add(new Chat("Tannu","Hi, What's up?","9:00 AM",R.drawable.family_younger_sister));
        ChatAdapter itemsAdapter = new ChatAdapter(getActivity(), chats);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setHasFixedSize(true);
        //recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(itemsAdapter);
        itemsAdapter.notifyDataSetChanged();
        return rootView;
    }

}