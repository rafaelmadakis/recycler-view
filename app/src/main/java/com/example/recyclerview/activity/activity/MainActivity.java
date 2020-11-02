package com.example.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.adapter.Adapter;
import com.example.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.criarFilmes();

        //Configura adapter
        Adapter adapter = new Adapter(listaFilmes);



        //Configura RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    public void criarFilmes(){

        Filme filme =  new Filme("Homem Aranha - De volta ao lar", "Ação", "2017");
        this.listaFilmes.add(filme);

        filme =  new Filme("Mulher Maravilha", "Ação", "2019");
        this.listaFilmes.add(filme);

        filme =  new Filme("Liga da Justiça", "Ação", "2020");
        this.listaFilmes.add(filme);

        filme =  new Filme("Capitão América", "Aventura/Ficção", "2016");
        this.listaFilmes.add(filme);

        filme =  new Filme("It: A Coisa", "Terror", "2015");
        this.listaFilmes.add(filme);

        filme =  new Filme("Pica-Pau: O Filme", "comédia/Ação", "2017");
        this.listaFilmes.add(filme);

        filme =  new Filme("A Múmia", "Terror", "2015");
        this.listaFilmes.add(filme);

        filme =  new Filme("A Bela e a Fera", "Romance", "2013");
        this.listaFilmes.add(filme);

        filme =  new Filme("Meu Malvado favorito 3", "Comédia", "2017");
        this.listaFilmes.add(filme);

        filme =  new Filme("Homem Aranha - De volta ao lar", "Ação", "2017");
        this.listaFilmes.add(filme);

        filme =  new Filme("Homem Aranha - De volta ao lar", "Ação", "2017");
        this.listaFilmes.add(filme);
    }
}