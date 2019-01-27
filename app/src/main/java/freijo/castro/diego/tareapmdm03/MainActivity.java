package freijo.castro.diego.tareapmdm03;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG=MainActivity.class.getSimpleName();
    public static final int TEXTO_RESPUESTA=1;

    private EditText etMensaje;
    private TextView tvRespuesta, tvTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMensaje=(EditText) findViewById(R.id.etMensaje);
        tvTitulo=(TextView) findViewById(R.id.tvTitulo);
        tvRespuesta=(TextView) findViewById(R.id.tvRespuesta);

        Log.e("MainActivity", "Hola mundo");

    }

    public void lanzarSegundaActivity(View view){
        Log.d(LOG_TAG, "Boton segunda activity");

        Intent intent=new Intent(this, SegundaActivity.class);
        String mensaje=etMensaje.getText().toString();
        intent.putExtra("Mensaje", mensaje);
        startActivityForResult(intent, TEXTO_RESPUESTA);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXTO_RESPUESTA) {

            if (resultCode == RESULT_OK) {

                String respuesta =data.getStringExtra(SegundaActivity.EXTRA_RESPUESTA);
                tvTitulo.setVisibility(View.VISIBLE);
                tvRespuesta.setText(respuesta);
                tvRespuesta.setVisibility(View.VISIBLE);
            }
        }
    }
}
