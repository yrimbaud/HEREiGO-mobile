package hereigo.mobile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HEREiGOActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello!");
        setContentView(tv);
    }
}