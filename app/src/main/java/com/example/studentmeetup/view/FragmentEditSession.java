package com.example.studentmeetup.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.studentmeetup.MainActivity;
import com.example.studentmeetup.R;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class FragmentEditSession extends Fragment {

    private EditText mEditTextTitle;
    private EditText mEditTextDate;
    private EditText mEditTextTime;
    private Spinner mSpinnerCourse;
    private EditText mEditTextLocation;
    private EditText mEditTextDescription;
    private Button mBtnEditSession;
    private NavController navController;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This callback will only be called when MyFragment is at least Started.
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
                navController.popBackStack(R.id.nav_my_sessions, false);
                // Handle the back button event
            }
        };


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_edit_session, container, false);

        mEditTextTitle = view.findViewById(R.id.edit_text_title);
        mEditTextDate = view.findViewById(R.id.edit_text_date);
        mEditTextTime = view.findViewById(R.id.edit_text_time);
        mEditTextLocation = view.findViewById(R.id.edit_text_location);
        mEditTextDescription = view.findViewById(R.id.edit_text_description);
        mSpinnerCourse = view.findViewById(R.id.spinner_course);
        mBtnEditSession = view.findViewById(R.id.button_edit_session);


        return view;
    }
}
