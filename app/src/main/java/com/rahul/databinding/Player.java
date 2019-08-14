package com.rahul.databinding;

import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class Player {

    public String name;
    public String mail;
    public int imageId;

    public Player(String name, String mail, int imageId) {
        this.name = name;
        this.mail = mail;
        this.imageId = imageId;
    }

    @BindingAdapter("android:imageUrl")
    public static void loadImage(View view, int imageId){
        CircleImageView circleImageView = (CircleImageView) view;
        circleImageView.setImageDrawable(ContextCompat.getDrawable(view.getContext(),imageId));
    }


}
