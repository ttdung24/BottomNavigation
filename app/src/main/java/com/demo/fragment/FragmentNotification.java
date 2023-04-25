package com.demo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.demo.R;
import com.demo.adapter.MessageAdapter;
import com.demo.model.Message;

import java.util.ArrayList;
import java.util.List;

public class FragmentNotification extends Fragment {
    private MessageAdapter messageAdapter;
    private RecyclerView recyclerView;
    private List<Message> list;

    public FragmentNotification() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_noti, container, false);
        list = new ArrayList<>();
        list.add(new Message(R.drawable.images, "Dung", "Test", "19:30"));
        list.add(new Message(R.drawable.images, "Thanh", "Test", "19:00"));
        list.add(new Message(R.drawable.images, "Vinh", "Test", "20:30"));
        list.add(new Message(R.drawable.images, "TTTT", "Test", "09:30"));
        list.add(new Message(R.drawable.images, "Dung", "Test", "13:00"));
        list.add(new Message(R.drawable.images, "Khang", "Test", "19:30"));
        recyclerView = view.findViewById(R.id.recycleView);
        LinearLayoutManager manager = new LinearLayoutManager(view.getContext(), RecyclerView.VERTICAL, false);
        messageAdapter = new MessageAdapter(view.getContext(), list);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(messageAdapter);
        return view;
    }
}
