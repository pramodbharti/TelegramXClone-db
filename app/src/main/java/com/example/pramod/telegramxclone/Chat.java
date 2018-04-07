package com.example.pramod.telegramxclone;

/**
 * Created by pramod on 5/4/18.
 */

public class Chat {
    private String mChatTitle;
    private String mChatText;
    private String mTimeDate;

    private final static int NO_IMAGE_RESOURCE = -1;
    private final static int NO_UNREAD = -1;
    //Image Resource Id of the image
    private int mImageResourceId = NO_IMAGE_RESOURCE;
    private int mUnread = NO_UNREAD;
    /**
     * Here, creating a constructor of the class {@link Chat}
     *
     */
    public Chat(String chatTitle, String chatText, String timeDate, int imageResourceId) {
        mChatTitle = chatTitle;
        mChatText = chatText;
        mTimeDate = timeDate;
        mImageResourceId = imageResourceId;
    }

    public Chat(String chatTitle, String chatText, String timeDate, int imageResourceId, int unread) {
        mChatTitle = chatTitle;
        mChatText = chatText;
        mTimeDate = timeDate;
        mImageResourceId = imageResourceId;
        mUnread = unread;
    }

    /**
     * This method is used to get the title of the chat
     */
    public String getmChatTitle() {
        return mChatTitle;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "mChatTitle='" + mChatTitle + '\'' +
                ", mChatText='" + mChatText + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mUnread=" + mUnread +
                '}';
    }

    public String getmChatText() {
        return mChatText;
    }

    /**
     * @return image resource id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public int getmUnread(){return mUnread;}
    public String getmTimeDate(){return mTimeDate;}
    public boolean hasUnread(){return mUnread != NO_UNREAD;}
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_RESOURCE;
    }
}
