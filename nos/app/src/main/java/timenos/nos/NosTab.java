package timenos.nos;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;

/**
 * Created by carlos on 6/25/16.
 */
public class NosTab {

    public String title;
    public int icon;
    public int selectedIcon;
    public Fragment fragment;

    NosTab(String title, int icon, int selectedIcon, Fragment fragment) {
        this.title = title;
        this.icon = icon;
        this.selectedIcon = selectedIcon;
        this.fragment = fragment;
    }
}
