package team;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.verzeo.myintro_app.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeamFragment extends Fragment {

    RecyclerView RvTeam;
    TeamAdapter adapter;
    List<TeamItem> mdata;


    public TeamFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_team, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RvTeam = view.findViewById(R.id.rv_team);
        TeamItem item = new TeamItem("Android App Development",getString(R.string.lorem_text10),R.drawable.lang10);
        TeamItem item2 = new TeamItem("Web Development",getString(R.string.lorem_text11),R.drawable.lang9);
        TeamItem item3 = new TeamItem("JAVA",getString(R.string.lorem_text12),R.drawable.lang1);
        TeamItem item4 = new TeamItem("PYTHON",getString(R.string.lorem_text13),R.drawable.lang2);
        TeamItem item5 = new TeamItem("C++",getString(R.string.lorem_text14),R.drawable.lang3);
        TeamItem item6 = new TeamItem("JAVASCRIPT",getString(R.string.lorem_text15),R.drawable.lang4);
        TeamItem item7 = new TeamItem("PHP",getString(R.string.lorem_text16),R.drawable.lang5);
        TeamItem item8 = new TeamItem("HTML",getString(R.string.lorem_text17),R.drawable.lang6);
        TeamItem item9 = new TeamItem("CSS",getString(R.string.lorem_text18),R.drawable.lang7);
        TeamItem item10 = new TeamItem("MySQL",getString(R.string.lorem_text19),R.drawable.lang8);


        mdata = new ArrayList<>();
        mdata.add(item);
        mdata.add(item2);
        mdata.add(item3);
        mdata.add(item4);
        mdata.add(item5);
        mdata.add(item6);
        mdata.add(item7);
        mdata.add(item8);
        mdata.add(item9);
        mdata.add(item10);


        RvTeam.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new TeamAdapter(mdata);
        RvTeam.setAdapter(adapter);
    }
}