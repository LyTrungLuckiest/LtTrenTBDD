package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LoginTabFragment extends Fragment {

    private Button btDangNhap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_tab_fagment, container, false);

        // Tìm nút đăng nhập từ layout đã inflate
        btDangNhap = view.findViewById(R.id.btDangNhap);

        // Gán sự kiện click cho nút đăng nhập
        btDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang MainActivityHome
                Intent intent = new Intent(getActivity(), MainActivityHome.class);
                startActivity(intent);
                // Kết thúc Activity hiện tại nếu cần
                if (getActivity() != null) {
                    getActivity().finish();
                }
            }
        });

        return view;
    }
}
