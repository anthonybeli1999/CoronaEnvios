package com.example.coronaenvios.Fragmentos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentController;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.coronaenvios.Actividades.LoginActivity;
import com.example.coronaenvios.Actividades.MainActivity;
import com.example.coronaenvios.R;

public class ProfileFragment extends Fragment {

    View vista;
    TextView buttontextEdit;
    Button buttonSignOff;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_profile, container, false);

        buttontextEdit = vista.findViewById(R.id.profile_textbutton_edit);
        buttonSignOff = vista.findViewById(R.id.profile_button_signoff);

        buttontextEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfileEditFragment profileEditFragment = new ProfileEditFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, profileEditFragment);
                transaction.commit();
            }
        });

        buttonSignOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return vista;
    }
}
