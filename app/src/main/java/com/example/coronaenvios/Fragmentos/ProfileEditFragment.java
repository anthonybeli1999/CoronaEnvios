package com.example.coronaenvios.Fragmentos;

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
import androidx.fragment.app.FragmentTransaction;

import com.example.coronaenvios.R;

public class ProfileEditFragment extends Fragment {

    View vista;
    TextView buttontextCancel;
    Button buttonUpdate;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_profile_edit, container, false);

        buttontextCancel = vista.findViewById(R.id.profile_textbutton_cancel);
        buttonUpdate = vista.findViewById(R.id.profile_button_update);

        buttontextCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfileFragment profileFragment = new ProfileFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, profileFragment);
                transaction.commit();
            }
        });

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Cambios guardados correctamente",Toast.LENGTH_SHORT).show();
                ProfileFragment profileFragment = new ProfileFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, profileFragment);
                transaction.commit();
            }
        });

        return vista;
    }
}
