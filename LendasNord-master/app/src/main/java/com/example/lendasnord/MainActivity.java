package com.example.lendasnord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



         final String [] texto =
                {
                        "ODIN-\n\nDevido ao seu amor pela batalha, é o principal deus da mitologia nórdica – nascida em países do norte da Europa, como Suécia, Dinamarca e Islândia. Odin é o mais velho e sábio dos deuses. Com só um olho bom, ele vive com dois corvos em seus ombros: Huginn (pensamento) e Muninn (memória), que simbolizam a busca pelo conhecimento.",
                        "THOR-\n\nO deus do trovão, é filho de Odin com outra deusa (Fjorgyn). Muito forte, tem como arma um martelo mágico. É o grande guerreiro dos deuses contra seus principais inimigos, os gigantes de gelo."
                        ,
                        "SKADI-\n\nSkadi foi para Asgard para se vingar da morte do pai, um gigante. Temendo um confronto, os deuses colocaram os olhos do pai dela como estrelas no céu e lhe ofereceram Njord como marido."
                                ,
                        "TYR-\n\nFilho de Odin e Frigg, tem força e coragem, e lidera os deuses nas batalhas. Sacrificou uma das mãos para o lobo Fenrir (filho de Loki) para manter a paz entre os deuses após mais uma das brigas entre eles.",

                        "LOKI-\n\n“Pai das Mentiras”, é parte gigante, parte deus. Às vezes é mostrado como irmão de Thor, mas na mitologia tradicional é irmão adotivo de Odin. Tem caráter maligno, mas traz equilíbrio ao panteão dos deuses.",

                        "FREYA-\n\nFilha de Njord e Skadi. Deusa do amor e da luxúria, é uma mulher sensual. Amante de magia e feitiçaria, ela pode tomar a forma de um pássaro para viajar ao mundo dos mortos e trazer profecias.",

                        "BALDER-\n\nOutro filho de Odin e Frigg, é o mais belo, misericordioso e justo dos deuses. Espalha paz onde quer que ande. Por ser o deus mais amado e popular, tornou-se um dos alvos preferidos das intrigas de Loki.",
                        "NJORD-\n\nProtetor dos navegadores, escolheu viver em Asgard após firmar uma paz com Odin. Os que o adoram navegam tranqüilos e têm boa sorte no nascimento dos filhos.",

                        "BRAGI-\n\nFilho de Odin com uma gigante, é o porta-voz e mensageiro dos deuses. Bom de “discurso”, tem o nome citado nos brindes que antecedem a narração de grandes histórias.",

                        "FORSETI-\n\nO deus da justiça é filho de Balder e define as disputas entre os deuses e os humanos. Na mitologia, nunca falhou em um acordo. Falando por horas a fio, sempre convence os deuses pelo cansaço.",
                        "FREYR-\n\nO irmão de Freyja é o deus da abundância. Decide quando a chuva cai, dá fartura aos frutos da terra, e é invocado na paz e na prosperidade. Possui um barco capaz de carregar todos os deuses.",

                        "FRIGG-\n\nMulher de Odin, a deusa da fertilidade veste um manto que parece com as nuvens – e que muda de cor de acordo com seu humor. Representa a feminilidade e era invocada pelas mulheres nos partos.",

                        "HEL-\n\nFilha de Loki com uma gigante de gelo, é a deusa de Niflheim, a terra dos mortos. Descrita como uma figura de feições sempre sombrias, é viva da cintura para cima e morta da cintura para baixo.",

                        "O Mundo-\n\nASGARD –É onde vivem quase todos os deuses. A paz por lá só reinou após muito quebra-pau entre eles. Asgard é cheia de grandes salões, como o grandioso Valhalla, salão de Odin.\n\n"+

                        "MIDGARD– Os humanos vivem aqui. Midgard é cercada por um vasto oceano e é ligada a Asgard pela Bifrost, uma ponte em forma de arco-íris vigiada pelo deus Heimdall.\n\n"+
                        "JOTUNHEIM– Região dentro de Midgard habitada por gigantes, raça que vive em conflito com os deuses. Lá fica uma fortaleza chamada Utgard, palco de várias aventuras de Thor.\n\n"+

                        "NIFLHEIM– O terceiro e último nível é o domínio dos mortos. É um local gelado, onde a noite não tem fim e aonde os homens de mau caráter são enviados após a morte."

                };


        final int [] bancoDeImagens =
                {
                        R.drawable.odin,
                        R.drawable.thor,
                        R.drawable.skadi,
                        R.drawable.tyr,
                        R.drawable.loki,
                        R.drawable.freya,
                        R.drawable.balder,
                        R.drawable.njord,
                        R.drawable.bragi,
                        R.drawable.forseti,
                        R.drawable.freyr,
                        R.drawable.frigg,
                        R.drawable.hel,
                        R.drawable.arvore
                };


        Button[] Bts =
                {
                       (Button) findViewById(R.id.OdinID),
                       (Button) findViewById(R.id.THORid),
                       (Button) findViewById(R.id.SkadiID),
                       (Button) findViewById(R.id.TyrId),
                       (Button) findViewById(R.id.LokiID),
                       (Button) findViewById(R.id.FreyaID),
                       (Button) findViewById(R.id.balderID),
                       (Button) findViewById(R.id.NjordID),
                       (Button) findViewById(R.id.BragiID),
                       (Button) findViewById(R.id.ForsetiID),
                       (Button) findViewById(R.id.FreyrID),
                       (Button) findViewById(R.id.FriggID),
                       (Button) findViewById(R.id.HelID),
                       (Button) findViewById(R.id.MundoID),

                };
        Bts[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[0]);
                intent.putExtra("imagem",bancoDeImagens[0]);
                startActivity(intent);

            }
        });
        Bts[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[1]);
                intent.putExtra("imagem",bancoDeImagens[1]);
                startActivity(intent);

            }
        });
        Bts[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[2]);
                intent.putExtra("imagem",bancoDeImagens[2]);
                startActivity(intent);

            }
        });
        Bts[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[3]);
                intent.putExtra("imagem",bancoDeImagens[3]);
                startActivity(intent);

            }
        });
        Bts[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[4]);
                intent.putExtra("imagem",bancoDeImagens[4]);
                startActivity(intent);

            }
        });
        Bts[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[5]);
                intent.putExtra("imagem",bancoDeImagens[5]);
                startActivity(intent);

            }
        });
        Bts[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[6]);
                intent.putExtra("imagem",bancoDeImagens[6]);
                startActivity(intent);

            }
        });
        Bts[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[7]);
                intent.putExtra("imagem",bancoDeImagens[7]);
                startActivity(intent);

            }
        });
        Bts[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[8]);
                intent.putExtra("imagem",bancoDeImagens[8]);
                startActivity(intent);

            }
        });
        Bts[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[9]);
                intent.putExtra("imagem",bancoDeImagens[9]);
                startActivity(intent);

            }
        });
        Bts[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[10]);
                intent.putExtra("imagem",bancoDeImagens[10]);
                startActivity(intent);

            }
        });
        Bts[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[11]);
                intent.putExtra("imagem",bancoDeImagens[11]);
                startActivity(intent);


            }
        });
        Bts[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[12]);
                intent.putExtra("imagem",bancoDeImagens[12]);
                startActivity(intent);

            }
        });
        Bts[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, API_ImagenS.class);
                intent.putExtra("Texto",texto[13]);
                intent.putExtra("imagem",bancoDeImagens[13]);
                startActivity(intent);

            }
        });

    }


    ;
};