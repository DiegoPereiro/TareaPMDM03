package freijo.castro.diego.tareapmdm03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PublicKey;

public class SegundaActivity extends AppCompatActivity {
    public static final String EXTRA_RESPUESTA ="com.example.android.twoactivities.extra.REPLY";

    private TextView tvMensaje;
    private EditText etRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent=getIntent();
        tvMensaje=(TextView) findViewById(R.id.tvMensaje);
        etRespuesta=(EditText) findViewById(R.id.etRespuesta);



        String mensaje=intent.getStringExtra("Mensaje");
        tvMensaje.setText(mensaje);
    }
    public void respuesta(View view){
        String respuesta=etRespuesta.getText().toString();

        Intent intent=new Intent();
        intent.putExtra(EXTRA_RESPUESTA, respuesta);
        setResult(RESULT_OK, intent);
        finish();

    }
}
