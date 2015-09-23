package com.example.madany.app_botton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    TextView texto;
    EditText ediTex;
    Button boton, botonN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.texto);
        ediTex = (EditText) findViewById(R.id.edittext);
        boton= (Button) findViewById(R.id.boton);
        botonN= (Button) findViewById(R.id.botonN);

        boton.setOnClickListener(this);
        botonN.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.boton:
                String dato = ediTex.getText().toString();
                texto.setText(dato);
                break;
            case R.id.botonN:
                texto.setText("Boton2 %%%%");
                break;

        }

    }
}
