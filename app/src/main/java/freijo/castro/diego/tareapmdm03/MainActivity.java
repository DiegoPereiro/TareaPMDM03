package freijo.castro.diego.tareapmdm03;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG=MainActivity.class.getSimpleName();

    private EditText etMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("MainActivity", "Hola mundo");

        etMensaje=(EditText) findViewById(R.id.etMensaje);

    }

    public void lanzarSegundaActivity(View view){
        Log.d(LOG_TAG, "Boton segunda activity");

        Intent intent=new Intent(this, SegundaActivity.class);
        String mensaje=etMensaje.getText().toString();
        intent.putExtra("Mensaje", mensaje);
        startActivity(intent);
    }
}
