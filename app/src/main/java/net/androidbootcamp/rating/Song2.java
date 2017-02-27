package net.androidbootcamp.rating;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Song2 extends AppCompatActivity {

    Button button1;
    MediaPlayer mpjig;
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song2);
        button1 = (Button)findViewById(R.id.btnSong2);
        button1.setOnClickListener(bjig);
        mpjig = new MediaPlayer();
        mpjig = MediaPlayer.create(this, R.raw.jig);
        playing = 0;
    }

    Button.OnClickListener bjig = new Button.OnClickListener()
    {

        @Override
        public void onClick(View v) {
            switch (playing)
            {
                case 0:
                    mpjig.start();
                    playing = 1;
                    button1.setText("Pause song 2");
                    break;
                case 1:
                    mpjig.pause();
                    playing = 0;
                    button1.setText("Play song 2");
                    break;
            }

        }
    };
}
