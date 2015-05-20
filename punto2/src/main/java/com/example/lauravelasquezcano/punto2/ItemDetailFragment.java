package com.example.lauravelasquezcano.punto2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.lauravelasquezcano.punto2.dummy.DummyContent;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Show the dummy content as text in a TextView.
        if(mItem.content=="Publicidad"){
            View rootView = inflater.inflate(R.layout.fragment_publicidad, container, false);
            return rootView;
        }else if(mItem.content=="Hoteles"){
            View rootView = inflater.inflate(R.layout.fragment_hoteles, container, false);
            return rootView;
        }else if(mItem.content=="Bares"){
            View rootView = inflater.inflate(R.layout.fragment_bares, container, false);
            return rootView;
        }else if(mItem.content=="Sitios turisticos"){
            View rootView = inflater.inflate(R.layout.fragment_sitios__turisticos, container, false);
            return rootView;
        }else if(mItem.content=="Demografía"){
            View rootView = inflater.inflate(R.layout.fragment_demografia, container, false);
            return rootView;
        }else if(mItem.content=="Acerca de"){
            View rootView = inflater.inflate(R.layout.fragment_acerca_de, container, false);
            return rootView;
        }else {
            View rootView = inflater.inflate(R.layout.fragment_item_detail, container, false);
            return rootView;
        }

    }
}
