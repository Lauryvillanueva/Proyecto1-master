package com.uninorte.proyecto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Actividad_Reportes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(Materias.this, R.string.up, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Actividad_Reportes.this,Home.class);
                startActivityForResult(i,1);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent i = new Intent(Actividad_Reportes.this,Home.class);
            startActivityForResult(i,1);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick_reporteEval(View view) {
        //mostrar el recycler view de ASIGNATURAS, SELECCIONAR ASIGNATURA
        //mostrar el recycler view de EVALUACIONES DE LA ASIG, SELECCIONAR EVALUAC

        //NOTAS -- usa el row rowdreporteevaluacion

        //Intent i = new Intent(Actividad_Reportes.this,ReporteEvaluacion.class);
        //startActivity(i);

    }

    public void onClick_reporteEst(View view) {
        //mostrar el recycler view de ASIGNATURAS, SELECCIONAR ASIGNATURA
        //mostrar el recycler view de ESTUDIANTES DE LA ASIG, SELECCIONAR ESTUDIANTE

        //NOTAS -- usa el row rowreportestudiante

        //Intent i = new Intent(Actividad_Reportes.this,ReporteEstudiantes.class);
        //startActivity(i);

    }
}
