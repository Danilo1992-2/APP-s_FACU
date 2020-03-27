package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.Disciplina;
import com.example.recyclerview.util.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Disciplina> disciplinas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de disciplinas
        this.criarDisciplinas();

        //Configurar adapter
        Adapter adapter = new Adapter( disciplinas );

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setHasFixedSize( true );
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter( adapter );

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Disciplina  d = disciplinas.get(position);

                                Toast.makeText(MainActivity.this,d.getDiaSemana()+" - "+d.getSala(),Toast.LENGTH_SHORT).show();

                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Disciplina  d = disciplinas.get(position);

                                Toast.makeText(MainActivity.this,d.getNomeDisciplina()+" - "+d.getProfessor(),Toast.LENGTH_SHORT).show();


                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                            }
                        }


                )





        );
    }

    public void criarDisciplinas() {

        Disciplina d = new Disciplina(R.drawable.professorx,"Lógica de Programação","Juan Baptista","SEG","LAB 05" );
        disciplinas.add(d);

        d = new Disciplina(R.drawable.banner,"Estatística Computacional","Wellington Avila","SEG","SALA 107" );
        disciplinas.add(d);

        d = new Disciplina(R.drawable.banner,"Teoria de Sistemas da Informação","Wellington Avila","TER","SALA 109" );
        disciplinas.add(d);

        d = new Disciplina(R.drawable.beast,"Banco de Dados I","Fabrício Curvello","QUA","LAB 05");
        disciplinas.add(d);

        d = new Disciplina(R.drawable.banner,"Arquitetura de Computadores","Wellington Avila","QUA","LAB 05");
        disciplinas.add(d);

        d = new Disciplina(R.drawable.beast,"Programação Orientada a Objetos","Fabrício Curvello","QUA","LAB 04");
        disciplinas.add(d);

        d = new Disciplina(R.drawable.beast,"Computação para Dispositivos Móveis","Fabrício Curvello","QUI","LAB 02");
        disciplinas.add(d);

        d = new Disciplina(R.drawable.professorx,"Estrutura de Dados","Juan Baptista","QUI","LAB 04");
        disciplinas.add(d);

        d = new Disciplina(R.drawable.banner,"Interface Humano-Computador","Wellington Avila","SEX","SALA 109");
        disciplinas.add(d);

        d = new Disciplina(R.drawable.professorx,"Desevolvimento de Software para Web","Juan Baptista","SEX","LAB 02");
        disciplinas.add(d);
    }

}
