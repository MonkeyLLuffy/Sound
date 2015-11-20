package com.example.monkeyllyffy.sound;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    private Button bntRecord;
    private View rcChat_popup;
    private ImageView volume;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_sound);
        bntRecord=(Button)findViewById(R.id.bntRecord);
        rcChat_popup = this.findViewById(R.id.rcChat_popup);
        volume = (ImageView) this.findViewById(R.id.volume);

        voice_rcd_hint_rcding = (LinearLayout)this.findViewById(R.id.voice_rcd_hint_rcding);
        sound_file=(LinearLayout)this.findViewById(R.id.sound_file);
        txtName=(TextView)findViewById(R.id.show_sound);
        timedown=(Chronometer)findViewById(R.id.timedown);
        use_bnt=(ImageButton)findViewById(R.id.used_bnt);
        voiceName="MySound.mp3";




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
