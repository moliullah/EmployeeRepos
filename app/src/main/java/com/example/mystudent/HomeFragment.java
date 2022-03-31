package com.example.mystudent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mystudent.adapters.StudentAdapter;
import com.example.mystudent.databinding.FragmentHomeBinding;
import com.example.mystudent.models.Student;

public class HomeFragment extends Fragment {
private FragmentHomeBinding binding;
    public HomeFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentHomeBinding.inflate(inflater);
        StudentAdapter adapter=new StudentAdapter(Student.getAllStudent());
        LinearLayoutManager llm=new LinearLayoutManager(getContext());
        llm.setOrientation(RecyclerView.VERTICAL);
        binding.studentRV.setAdapter(adapter);
        binding.studentRV.setLayoutManager(llm);
        return binding.getRoot();
    }
}