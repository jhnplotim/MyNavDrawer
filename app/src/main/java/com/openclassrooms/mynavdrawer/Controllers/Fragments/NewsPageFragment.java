package com.openclassrooms.mynavdrawer.Controllers.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.openclassrooms.mynavdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsPageFragment extends Fragment {

	public static NewsPageFragment newInstance() {
		return (new NewsPageFragment());
	}


	public NewsPageFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_news_page, container, false);
	}

}
