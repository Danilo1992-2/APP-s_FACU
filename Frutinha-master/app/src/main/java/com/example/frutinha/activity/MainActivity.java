package com.example.frutinha.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.example.frutinha.R;
import com.example.frutinha.adapter.Adapter;
import com.example.frutinha.model.Filmes;
import com.example.frutinha.util.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filmes> filmes = new ArrayList<>();

    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        this.CriarFilme();
        Adapter adapter = new Adapter(filmes);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {

                            @Override

                            public void onItemClick(View view, int position) {
                                Filmes f = filmes.get(position);
                                Intent intent = new Intent(MainActivity.this,Sinopse.class);
                                intent.putExtra("imagem",f.getNumImagem());
                                intent.putExtra("nomeFilme",f.getSinop());
                                startActivity(intent);
                            }
                            @Override
                            public void onLongItemClick(View view, int position) {
                                Filmes f = filmes.get(position);
                                Toast.makeText(MainActivity.this,"Para ver informações de "+f.getNomefilme()+" click só uma vez ",Toast.LENGTH_LONG).show();
                            }
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            }
                        }

                )
        );

    }
    public void CriarFilme(){
        Filmes f = new Filmes(R.drawable.titanic,"TITANIC","Jack Dawson (Leonardo DiCaprio) é um jovem aventureiro que, na mesa de jogo, ganha uma passagem para a primeira viagem do transatlântico Titanic. Trata-se de um luxuoso e imponente navio, anunciado na época como inafundável, que parte para os Estados Unidos. Nele está também Rose DeWitt Bukater (Kate Winslet), a jovem noiva de Caledon Hockley (Billy Zane). Rose está descontente com sua vida, já que sente-se sufocada pelos costumes da elite e não ama Caledon. Entretanto, ela precisa se casar com ele para manter o bom nome da família, que está falida. Um dia, desesperada, Rose ameaça se atirar do Titanic, mas Jack consegue demovê-la da ideia. Pelo ato ele é convidado a jantar na primeira classe, onde começa a se tornar mais próximo de Rose. Logo eles se apaixonam, despertando a fúria de Caledon. A situação fica ainda mais complicada quando o Titanic se choca com um iceberg, provocando algo que ninguém imaginava ser possível: o naufrágio do navio.");
        filmes.add(f);
        f = new Filmes(R.drawable.vingadores,"VINGADORES","Após Thanos eliminar metade das criaturas vivas, os Vingadores precisam lidar com a dor da perda de amigos e seus entes queridos. Com Tony Stark (Robert Downey Jr.) vagando perdido no espaço sem água nem comida, Steve Rogers (Chris Evans) e Natasha Romanov (Scarlett Johansson) precisam liderar a resistência contra o titã louco.");
        filmes.add(f);
        f = new Filmes(R.drawable.velozes,"VELOZES \nE\n FURIOSOS","Desde que se conheceram, Luke Hobbs (Dwayne Johnson) e Deckard Shaw (Jason Statham) constantemente bateram de frente, não só por inicialmente estarem em lados opostos mas, especialmente, pela personalidade de cada um. Agora, a dupla precisa unir forças para enfrentar Brixton (Idris Elba), um homem alterado geneticamente que deseja obter um vírus mortal para pôr em andamento um plano que mataria milhões de pessoas em nome de uma suposta evolução da humanidade. Para tanto eles contam com a ajuda de Hattie (Vanessa Kirby), irmã de Shaw, que é também agente do MI6, o serviço secreto britânico.");
        filmes.add(f);
        f = new Filmes(R.drawable.pokemon,"POKEMON\n 2000","Enquanto Ash, Misty e Tracey viajam num barco, Giraldan, um colecionador de bichinhos pokémon, prepara seu mais novo plano: capturar o raro Lugia. Para tanto, provoca uma catástrofe climática quando ataca e retira de suas ilhas os três pássaros sagrados: Moltres, o pássaro-guardião de fogo; Zapdos, o pássaro-guardião do trovão; e Articuno, o pássaro-guardião do gelo. Para evitar o completo colapso do mundo em que vivem, os pokémons e seus treinadores resolvem se unir para enfrentar juntos Giraldan.");
        filmes.add(f);
        f = new Filmes(R.drawable.starwars,"STAR WARS","Após encontrar o mítico e recluso Luke Skywalker (Mark Hammil) em uma ilha isolada, a jovem Rey (Daisy Ridley) busca entender o balanço da Força a partir dos ensinamentos do mestre jedi. Paralelamente, o Primeiro Império de Kylo Ren (Adam Driver) se reorganiza para enfrentar a Aliança Rebelde.");
        filmes.add(f);
        f = new Filmes(R.drawable.senhordosaneis,"O SENHOR \nDOS\n ANEIS","uma terra fantástica e única, chamada Terra-Média, um hobbit (seres de estatura entre 80 cm e 1,20 m, com pés peludos e bochechas um pouco avermelhadas) recebe de presente de seu tio o Um Anel, um anel mágico e maligno que precisa ser destruído antes que caia nas mãos do mal. Para isso o hobbit Frodo (Elijah Woods) terá um caminho árduo pela frente, onde encontrará perigo, medo e personagens bizarros. Ao seu lado para o cumprimento desta jornada aos poucos ele poderá contar com outros hobbits, um elfo, um anão, dois humanos e um mago, totalizando 9 pessoas que formarão a Sociedade do Anel.");
        filmes.add(f);
        f = new Filmes(R.drawable.harrypotter,"HARRY \nPOTTER","Nunca houve iniciativa tão ousada. Oito filmes em 10 anos, de uma série que ainda estava em desenvolvimento quando o primeiro foi lançado. Atores escolhidos quando ainda eram crianças, de forma que o público pudesse vê-los crescer nas telonas, a cada filme. A Warner apostou alto e certeiro. Harry Potter era um fenômeno pop, daqueles que arrebatam gerações de tempos em tempos. Vê-lo chegar ao fim, agora no cinema, traz de volta lembranças. De erros e acertos, mas acima de tudo de momentos marcantes. Lembranças construídas ao longo de uma década e importantes para a completa compreensão da história final.Não é essencial que se tenha lido os livros para compreender Harry Potter e as Relíquias da Morte – Parte 2, mas é bom ter ao menos assistido os filmes. A Parte 1, então, é indispensável. O início do fim da série começa no mesmo ponto onde o filme anterior termina, com o túmulo de Dumbledo...");
        filmes.add(f);
        f = new Filmes(R.drawable.joker,"JOKER","Arthur Fleck (Joaquin Phoenix) trabalha como palhaço para uma agência de talentos e, toda semana, precisa comparecer a uma agente social, devido aos seus conhecidos problemas mentais. Após ser demitido, Fleck reage mal à gozação de três homens em pleno metrô e os mata. Os assassinatos iniciam um movimento popular contra a elite de Gotham City, da qual Thomas Wayne (Brett Cullen) é seu maior representante.");
        filmes.add(f);


    }


}
