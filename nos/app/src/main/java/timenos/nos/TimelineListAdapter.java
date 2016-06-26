package timenos.nos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by carlos on 6/25/16.
 */
public class TimelineListAdapter extends ArrayAdapter {

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View post = convertView;
        if (post == null) {
            post = LayoutInflater.from(parent.getContext()).inflate(R.layout.timeline_post, parent, false);
        }
        return post;
    }

    @Override
    public int getCount() {
        return 5;
    }

    TimelineListAdapter(Context context) {
        super(context, R.layout.timeline_post);
    }

    private TimelineListAdapter(Context context, int resource) {
        super(context, resource);
    }

    private TimelineListAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    private TimelineListAdapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
    }

    private TimelineListAdapter(Context context, int resource, int textViewResourceId, Object[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    private TimelineListAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }

    private TimelineListAdapter(Context context, int resource, int textViewResourceId, List objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
