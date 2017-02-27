package net.androidbootcamp.rating;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Song3 extends AppCompatActivity {

    Button button1;
    MediaPlayer mpmarimba;
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song3);
        button1 = (Button)findViewById(R.id.btnSong3);
        button1.setOnClickListener(bmarimba);
        mpmarimba = new MediaPlayer();
        mpmarimba = MediaPlayer.create(this, R.raw.marimba);
        playing = 0;
    }

    Button.OnClickListener bmarimba = new Button.OnClickListener()
    {

        @Override
        public void onClick(View v) {
            switch (playing)
            {
                case 0:
                    mpmarimba.start();
                    playing = 1;
                    button1.setText("Pause song 3");
                    break;
                case 1:
                    mpmarimba.pause();
                    playing = 0;
                    button1.setText("Play song 3");
                    break;
            }

        }
    };
}
