package net.androidbootcamp.rating;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Song1 extends AppCompatActivity {
    Button button1;
    MediaPlayer mpBagPipes;
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song1);
        button1 = (Button)findViewById(R.id.btnSong1);
        button1.setOnClickListener(bBagPipes);
        mpBagPipes = new MediaPlayer();
        mpBagPipes = MediaPlayer.create(this, R.raw.bagpipes);
        playing = 0;
    }

    Button.OnClickListener bBagPipes = new Button.OnClickListener()
    {

        @Override
        public void onClick(View v) {
            switch (playing)
            {
                case 0:
                    mpBagPipes.start();
                    playing = 1;
                    button1.setText("Pause song 1");
                    break;
                case 1:
                    mpBagPipes.pause();
                    playing = 0;
                    button1.setText("Play song 1");
                    break;
            }

        }
    };
}
