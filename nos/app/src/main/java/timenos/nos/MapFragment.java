package timenos.nos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by carlos on 6/24/16.
 */
public class MapFragment extends Fragment {
    public MapFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.map_fragment, container, false);
        WebView map = (WebView) rootView.findViewById(R.id.map_web_view);
        map.loadUrl("https://developer.android.com/training/system-ui/status.html");
        return rootView;
    }
}
