package com.netanel.logservice;


import android.os.Parcel;
import android.os.Parcelable;

public class Message implements Parcelable{
    String tag;
    String text;

    public Message(Parcel in){
        tag = in.readString();
        text = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<Message> CREATOR
            = new Parcelable.Creator<Message>() { //
        public Message createFromParcel(Parcel source) {
            return new Message(source);
        }
        public Message[] newArray(int size) {
            return new Message[size];
        }
    };

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    public Message() {
        super();
    }


    // Getter and Setters for fields
    public String getTag() {
        return tag;
    }

    public String getText() {
        return text;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setText(String text) {
        this.text = text;
    }
}
