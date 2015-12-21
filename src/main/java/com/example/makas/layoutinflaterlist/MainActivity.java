/**
 * Created by makas on 20.12.2015.
 */
package com.example.makas.layoutinflaterlist;

        import android.app.Activity;
        import android.R;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup.LayoutParams;
        import android.widget.LinearLayout;
        import android.widget.TextView;

public class MainActivity extends Activity {

    String[] name = {"StarWars ep.I", "StarWars ep.II", "StarWars ep.III", "StarWars ep.IV", "StarWars ep.V", "StarWars ep.VI",
            "StarWars ep.VII", "StarWars ep.VIII"};
    String[] year = {"1999", "2002", "2005",
            "1977", "1980", "1983", "2015", "2018"};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout);

        LayoutInflater ltInflater = getLayoutInflater();

        for (int i = 0; i < name.length; i++) {
            Log.d("myLogs", "i = " + i);
            View item = ltInflater.inflate(R.layout.item, linLayout, false);
            TextView Name = (TextView) item.findViewById(R.id.name);
            Name.setText(name[i]);
            TextView Year = (TextView) item.findViewById(R.id.year);
            Year.setText("Year " + year[i]);
            item.getLayoutParams().width = LayoutParams.MATCH_PARENT;
            linLayout.addView(item);
        }
    }
}





