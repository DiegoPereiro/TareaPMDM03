package freijo.castro.diego.tareapmdm03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvRecibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent=getIntent();
        tvRecibir=(TextView) findViewById(R.id.txtRecibir);
        String mensaje=intent.getStringExtra("Mensaje");
        tvRecibir.setText(mensaje);
    }
}
