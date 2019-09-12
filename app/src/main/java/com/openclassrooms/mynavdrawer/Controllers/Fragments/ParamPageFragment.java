package com.openclassrooms.mynavdrawer.Controllers.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.openclassrooms.mynavdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ParamPageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParamPageFragment extends Fragment {



	public ParamPageFragment() {
		// Required empty public constructor
	}

	public static ParamPageFragment newInstance() {
		ParamPageFragment fragment = new ParamPageFragment();
		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_param_page, container, false);
	}

}
