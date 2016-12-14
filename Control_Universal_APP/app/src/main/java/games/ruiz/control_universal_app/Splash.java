package games.ruiz.control_universal_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    protected static final long TIEMPO = 2200L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(TIEMPO);
                } catch (InterruptedException var6) {
                    var6.printStackTrace();
                } finally {
                    Intent Intento = new Intent("games.ruiz.control_universal_app.PRINCIPAL");
                    startActivity(Intento);
                }

            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.finish();
    }
}
