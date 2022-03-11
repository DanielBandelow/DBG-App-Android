package de.dbg_ratingen.dbgapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import de.dbg_ratingen.dbgapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OverviewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OverviewFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OverviewFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OverviewFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OverviewFragment newInstance(String param1, String param2) {
        OverviewFragment fragment = new OverviewFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_overview, container, false);
        LinearLayout list = view.findViewById(R.id.message_list);
        if (list != null) {
            list.addView(new PlanMessage(list.getContext(), "1/2", "M LK BRI", "Schüler haben Aufgaben"));
            list.addView(new PlanMessage(list.getContext(), "1/2", "D LK SGL", "Aufgaben über Teams"));
            list.addView(new PlanMessage(list.getContext(), "3/4", "EK EDN", "EvA"));
            list.addView(new PlanMessage(list.getContext(), "3/4", "PA NEM", "frei"));
            list.addView(new PlanMessage(list.getContext(), "3/4", "GE FRW", "Bitte auf die Klausur vorbereiten"));
            list.addView(new PlanMessage(list.getContext(), "3/4", "D KRF", "S.1, A2,4,8; S.16, 32, 64 lesen und Aufgaben auf S. 128 bearbeiten"));
            list.addView(new PlanMessage(list.getContext(), "5/6", "KR NIH", "Unterricht entfällt"));
            list.addView(new PlanMessage(list.getContext(), "5/6", "ER LOE", "informiert euch über die Lutherschen Thesen"));
            list.addView(new PlanMessage(list.getContext(), "5/6", "PH SGL", "Was ist die Essenz des Lebens? Aufsatz bis 17:00 abgeben"));
            list.addView(new PlanMessage(list.getContext(), "8/9", "SP ESH", "Springseilsprünge 1-100 lernen, Überprüfung nächste Stunde"));

        }
        return view;
    }
}