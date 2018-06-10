package com.example.tochi.campusfi;

import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Profile.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Profile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Profile extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Profile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Profile.
     */
    // TODO: Rename and change types and number of parameters
    public static Profile newInstance(String param1, String param2) {
        Profile fragment = new Profile();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        final ImageView timeline = view.findViewById(R.id.timelineIcon);
        final ImageView media = view.findViewById(R.id.mediaIcon);
        final ImageView tag = view.findViewById(R.id.tagIcon);
        final ImageView bookmark = view.findViewById(R.id.bookmarkIcon);

        timeline.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFD50000, PorterDuff.Mode.SRC_IN));
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.profileFrame, new Timeline());
        ft.commit();

        timeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeline.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFD50000, PorterDuff.Mode.SRC_IN));
                changeOthers(media, tag, bookmark);

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.profileFrame, new Timeline());
                ft.commit();
            }
        });

        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                media.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFD50000, PorterDuff.Mode.SRC_IN));
                changeOthers(timeline, tag, bookmark);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.profileFrame, new Media());
                ft.commit();
            }
        });

        tag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tag.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFD50000, PorterDuff.Mode.SRC_IN));
                changeOthers(timeline, media, bookmark);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.profileFrame, new Tag());
                ft.commit();
            }
        });


        bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bookmark.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFD50000, PorterDuff.Mode.SRC_IN));
                changeOthers(timeline, media, tag);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.profileFrame, new Bookmark());
                ft.commit();
            }
        });

        return view;
    }

    public void changeOthers(ImageView icon1, ImageView icon2, ImageView icon3){

        icon1.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFA4A4A4, PorterDuff.Mode.SRC_IN));
        icon2.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFA4A4A4, PorterDuff.Mode.SRC_IN));
        icon3.getDrawable().setColorFilter(new PorterDuffColorFilter(0xFFA4A4A4, PorterDuff.Mode.SRC_IN));

    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
