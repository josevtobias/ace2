package games.ruiz.control_universal_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Pincipal extends AppCompatActivity {
    private ImageButton btnAC,btnJardin,btnLuz,btnPorton,btnAlarma,btnIncendio,btnFuera;
    Toast toastPorton;
    Toast toastJardin;
    Toast toastAlarma;
    Toast toastIncendio;
    Toast toastFuera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pincipal);

        iniciaVars();
    }

    private void iniciaVars() {

        toastPorton = Toast.makeText(this, "Su casa no posee porton electrico", Toast.LENGTH_LONG);
        toastJardin = Toast.makeText(this, "Se esta regando su jardin, se recomienda dejar que el regado automatico actue para evitar el desperdicio de agua", Toast.LENGTH_LONG);
        toastAlarma = Toast.makeText(this, "Esta version de casa no tiene alarma", Toast.LENGTH_LONG);
        toastIncendio = Toast.makeText(this, "Esta version de casa no tiene control de incendio", Toast.LENGTH_LONG);
        toastFuera = Toast.makeText(this, "Se han apagadado los sistemas de iluminacion y de aire acondicionado", Toast.LENGTH_LONG);

        btnAC = (ImageButton)findViewById(R.id.btnAC);
        btnJardin = (ImageButton)findViewById(R.id.btnJardin);
        btnLuz = (ImageButton)findViewById(R.id.btnLuz);
        btnPorton = (ImageButton)findViewById(R.id.btnPorton);
        btnAlarma = (ImageButton)findViewById(R.id.btnAlarma);
        btnIncendio = (ImageButton)findViewById(R.id.btnIncendio);
        btnFuera = (ImageButton)findViewById(R.id.btnFuera);

        btnLuz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntento = new Intent("games.ruiz.control_universal_app.LUZ");
                startActivity(miIntento);
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntento = new Intent("games.ruiz.control_universal_app.AC");
                startActivity(miIntento);
            }
        });

        btnJardin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toastJardin.show();
            }
        });

        btnPorton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toastPorton.show();
            }
        });

        btnPorton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toastPorton.show();
            }
        });

        btnAlarma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toastAlarma.show();
            }
        });

        btnIncendio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toastIncendio.show();
            }
        });

        btnFuera.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toastFuera.show();
            }
        });

    }
}
