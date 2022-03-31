package com.example.mystudent.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mystudent.R;
import com.example.mystudent.databinding.StudentRowBinding;
import com.example.mystudent.models.Student;
import java.util.List;
public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    private StudentRowBinding binding;
    List<Student>studentList;
    public StudentAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       /* View itemView= LayoutInflater
                .from(parent.getContext()).inflate(R.layout.student_row,parent,false);*/
        binding=StudentRowBinding
                .inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new StudentViewHolder(binding);
    }
    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        final Student student= studentList.get(position);
        binding.studentNameTV.setText(student.getStudentname());
        binding.studentCgpaTV.setText((parseDouble(student.getStudentCgpa()))  ;
    }
    @Override
    public int getItemCount() {
        return studentList.size();
    }
    public class StudentViewHolder extends RecyclerView.ViewHolder {
       // TextView nameTV,cgpaTV;
        public StudentViewHolder(@NonNull StudentRowBinding binding) {
            super(binding.getRoot());
           /* nameTV=itemView.findViewById(R.id.studentNameTV);
            cgpaTV=itemView.findViewById(R.id.studentCgpaTV);*/
        }
    }
}
