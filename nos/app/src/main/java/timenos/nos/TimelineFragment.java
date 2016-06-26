package timenos.nos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.ListView;

/**
 * Created by carlos on 6/24/16.
 */
public class TimelineFragment extends android.support.v4.app.Fragment {
    public TimelineFragment () {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.timeline_fragment, container, false);
        ListView timeline = (ListView) rootView.findViewById(R.id.timeline_list);
        timeline.setAdapter(new TimelineListAdapter(this.getContext()));
        return rootView;
    }
}
