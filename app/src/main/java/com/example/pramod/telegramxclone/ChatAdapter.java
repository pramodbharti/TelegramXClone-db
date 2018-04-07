package com.example.pramod.telegramxclone;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pramod on 6/4/18.
 */


/**
 * {@link ChatAdapter} exposes a list of chats
 * {@link android.support.v7.widget.RecyclerView}
 */
public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatAdapterViewHolder> {

    private List<Chat> mChats;
    private Context mContext;

    public ChatAdapter(Context context, List<Chat> chats){
        mChats=chats;
        mContext=context;
    }

    public class ChatAdapterViewHolder extends RecyclerView.ViewHolder  {
        private final TextView mChatTitle;
        public final TextView mChatText;
        public final ImageView mImageView;
        public final TextView mDateTime;
        public final TextView mUnread;

        public ChatAdapterViewHolder(View view) {
            super(view);
            mChatTitle = (TextView) view.findViewById(R.id.chat_title);
            mChatText = (TextView) view.findViewById(R.id.chat_text);
            mImageView = (ImageView) view.findViewById(R.id.avatar);
            mDateTime = (TextView) view.findViewById(R.id.date_time);
            mUnread = (TextView) view.findViewById(R.id.unread);
        }

    }

    @Override
    public ChatAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
         return new ChatAdapterViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.chat_list,viewGroup,false));
    }


    @Override
    public void onBindViewHolder(final ChatAdapterViewHolder chatAdapterViewHolder, int position) {
        final Chat row = mChats.get(position);
        chatAdapterViewHolder.mChatTitle.setText(row.getmChatTitle());
        chatAdapterViewHolder.mChatText.setText(row.getmChatText());
        chatAdapterViewHolder.mDateTime.setText(row.getmTimeDate());
        if (row.hasUnread()) {
            chatAdapterViewHolder.mUnread.setText(String.valueOf(row.getmUnread()));
            chatAdapterViewHolder.mUnread.setVisibility(View.VISIBLE);
        } else {
            chatAdapterViewHolder.mUnread.setVisibility(View.INVISIBLE);
        }
        chatAdapterViewHolder.mUnread.setText(String.valueOf(row.getmUnread()));
        if (row.hasImage()) {
            chatAdapterViewHolder.mImageView.setImageResource(row.getImageResourceId());
            chatAdapterViewHolder.mImageView.setVisibility(View.VISIBLE);
        } else {
            chatAdapterViewHolder.mImageView.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        if (null == mChats) return 0;
        return mChats.size();
    }

}