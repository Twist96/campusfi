package com.example.tochi.campusfi;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements Home.OnFragmentInteractionListener,
Message.OnFragmentInteractionListener, Notification.OnFragmentInteractionListener, Profile.OnFragmentInteractionListener,
Timeline.OnFragmentInteractionListener, Media.OnFragmentInteractionListener, Tag.OnFragmentInteractionListener, Bookmark.OnFragmentInteractionListener{
    ImageView home, message, cart, notification, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = findViewById(R.id.homeIcon);
        message = findViewById(R.id.messageIcon);
        cart = findViewById(R.id.cartIcon);
        notification = findViewById(R.id.notificationIcon);
        profile = findViewById(R.id.profileIcon);


        home.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFD50000, PorterDuff.Mode.SRC_IN));
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        android.app.Fragment home = new Home();
        ft.replace(R.id.mainFrame, home);
        ft.commit();

    }

    public void clickHome(View view) {

        changeColor(home);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.mainFrame, new Home());
        ft.commit();

    }

    public void clickMsg(View view) {

        changeColor(message);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        android.app.Fragment message = new Message();
        ft.replace(R.id.mainFrame, message);
        ft.commit();
    }

    public void clickCart(View view) {

        changeColor(cart);

        Intent intent = new Intent(this, Market.class);
        startActivity(intent);

    }

    public void clickNotification(View view) {

        changeColor(notification);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.mainFrame, new Notification());
        ft.commit();

    }

    public void clickProfile(View view) {

        changeColor(profile);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.mainFrame, new Profile());
        ft.commit();

    }

    public void changeColor(ImageView icon){

        if (Objects.equals(icon.getDrawable().getConstantState(), getResources().getDrawable(R.drawable.ic_home_gray_24dp).getConstantState())){

            home.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFD50000, PorterDuff.Mode.SRC_IN));
            changeOthers(message, cart, notification, profile);


        } else if (Objects.equals(icon.getDrawable().getConstantState(), getResources().getDrawable(R.drawable.ic_envelope2).getConstantState())){

            message.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFD50000, PorterDuff.Mode.SRC_IN));
            changeOthers(home, cart, notification, profile);

        } else if (Objects.equals(icon.getDrawable().getConstantState(), getResources().getDrawable(R.drawable.ic_cart).getConstantState())){

            cart.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFD50000, PorterDuff.Mode.SRC_IN));
            changeOthers(message, home, notification, profile);

        } else if (Objects.equals(icon.getDrawable().getConstantState(), getResources().getDrawable(R.drawable.ic_notifications_gray_24dp).getConstantState())){

            notification.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFD50000, PorterDuff.Mode.SRC_IN));
            changeOthers(message, cart, home, profile);

        } else if (Objects.equals(icon.getDrawable().getConstantState(), getResources().getDrawable(R.drawable.ic_account_circle_gray_24dp).getConstantState())){

            profile.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFD50000, PorterDuff.Mode.SRC_IN));
            changeOthers(message, cart, notification, home);

        }
    }

    public void changeOthers(ImageView icon1, ImageView icon2, ImageView icon3, ImageView icon4){

        icon1.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFA4A4A4, PorterDuff.Mode.SRC_IN));
        icon2.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFA4A4A4, PorterDuff.Mode.SRC_IN));
        icon3.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFA4A4A4, PorterDuff.Mode.SRC_IN));
        icon4.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFA4A4A4, PorterDuff.Mode.SRC_IN));

    }

    public void test(View view) {
        changeColor(home);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void toTimeline(View view){

    }
}
