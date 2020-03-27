package com.example.produtosnet.activity;

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
import com.example.produtosnet.R;
import com.example.produtosnet.adapter.Adapter;
import com.example.produtosnet.model.Produtos;
import com.example.produtosnet.util.RecyclerItemClickListener;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Produtos> produto = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        this.criarProduto();
        Adapter adapter = new Adapter(produto);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(),
                recyclerView,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    }

                    @Override
            public void onItemClick(View view, int position) {
                Produtos P = produto.get(position);

                Intent intent = new Intent(MainActivity.this,Retornos.class);
                intent.putExtra("infprod",P.getNomeproduto());
                intent.putExtra("img",P.getNumImagem());
                intent.putExtra("infp",P.getInfP());
                startActivity(intent);

            }

                    @Override
                    public void onLongItemClick(View view, int position) {


                        Toast.makeText(MainActivity.this,"Click só uma vez para ver os dados do produto!",Toast.LENGTH_SHORT).show();


                    }

                }
            )
        );

    }
    public void criarProduto()
    {
        Produtos P = new Produtos(R.drawable.drone,"Drone DJI Tello Fly More Combo, Branco\n","\n \nR$ 149,99","O drone Eachine E58 permitirá que você cruze fronteiras físicas e atinja várias alturas. Este produto sofisticado pode ser gerenciado remota e intuitivamente. Seus objetivos são amplos e diversos, pois são úteis em atividades como jogos, eventos, entregas, logística, fins ecológicos, vigilância, entre outros.\n" +
                "\n" +
                "Projetado para viver uma experiência única\n" +
                "Com a câmera Full HD você obterá imagens de alta resolução e qualidade, e poderá gravar toda a sua jornada com a foto perfeita. Inclui bateria que fornecerá ao drone energia suficiente para voar. No final da jornada, você poderá recarregá-las com facilidade e conveniência.");
        produto.add(P);
        P = new Produtos(R.drawable.fone,"Fone  Ouvido Bluetooth Headphone Edifier W800bt Preto\n","\n \nR$ 198,49","O headphone Hipermúsica foi desenvolvido para proporcionar a melhor experiência sonora.Com design sofisticado, dobrável e acabamento piano, é, também, sem fio e possui tecnologia bluetooth, o que traz maior liberdade e comodidade para você ouvir suas músicas favoritas e fazer ligações de qualquer lugar, sem ficar preso a fios, pois o alcance é de até 15 metros.É compatível com smartphones que possuem tecnologia bluetooth. A bateria tem autonomia de até 10 horas em modo ligação, 8 em modo música e 160 em standby. Compacto, possui dobras de sustentação em alumínio, facilitando o transporte e aumentando a durabilidade, alça emborrachada e protetores auriculares acolchoados, que possibilitam conforto por mais tempo e melhor isolamento acústico. Além disso, o Hipermúsica é versátil, possuindo, além da conectividade bluetooth, entrada P2, possibilitando escolher entre utilizar o produto com ou sem fio.\n" +
                "\n");
        produto.add(P);
        P = new Produtos(R.drawable.smartfone,"Smartphone Xiaomi Redmi Note 7 4GB RAM 64GB\n","\n \nR$ 789,99","Viva em alta definição\n" +
                "Sua tela HD+ de 6.26\" com notch de gota garante-lhe cores vívidas e intensas e ângulos de visão amplas para que possa desfrutar seus conteúdos favoritos.\n" +
                "\n" +
                "Efeito bokeh incrível\n" +
                "A câmera traseira dupla permitirá-lhe tirar fotos de alta qualidade com o famoso modo retrato raso. Além disso, com o reconhecimento inteligente, poderá otimizar cenas em distintos momentos do dia.\n" +
                "\n" +
                "Bateria superior\n" +
                "Desliga-se. Com a super bateria 4000 mAh você terá energia por mais tempo e poderá jogar, asistir séries ou trabalhar por dias sem precisar recarregar seu telefone.");
        produto.add(P);
        P = new Produtos(R.drawable.tv,"Smart TV LED 50\" TV UHD 4K com ThinQ AI Inteligência Artificial","\n \nR$ 1.799,99","Ter uma TV de tela grande em casa é muito bom, não é mesmo? Ainda mais quando ela conta com recursos modernos, que proporcionam conforto e bons momentos de entretenimento para quem está assistindo. A Smart TV LED 40\" Philco PTV40E21DSWN FULL HD é assim, ela vai te proporcionar maior nitidez, clareza e definição, para você assistir e curtir ao máximo seus programas, filmes e series preferidos. Com design moderno, imagem em FULL HD, conexões HDMI e USB, conversor digital integrado, Wi-Fi integrado, função Midiacast, que permite a comunicação entre dispositivos móveis e o aparelho de TV. Som Surround, que recria um ambiente mais realista de áudio, aumentando a qualidade sonora, e muito mais, ela é a escolha perfeita para transformar sua sala em um verdadeira sala de cinema. Tudo que você sempre quis em uma TV.");
        produto.add(P);
        P = new Produtos(R.drawable.vidgame,"Console PlayStation 4 Slim 1TB","\n \nR$ 1.599,99","Mais leve e mais fino, o sistema PlayStation 4 tem disco rígido de 1TB para tudo o que há de melhor em jogos, músicas e muito mais! O pacote PlayStation Hits oferece jogos incríveis que proporcionarão entretenimento sem fim com jogos dinâmicos e conectados, gráficos e velocidade intensos, personalização inteligente, recursos sociais integrados intensamente e inovadores recursos de segunda tela.\n" +
                "\n" +
                "Combina conteúdo sem igual, experiências de jogos imersivas, todos os seus aplicativos favoritos de entretenimento digital e recursos exclusivos do PlayStation. O PS4 é centrado nos jogadores, possibilitando que eles joguem quando, onde e como quiserem, possibilita que os maiores desenvolvedores de jogos do mundo deem asas à sua criatividade e transcendam os limites do ato de jogar por meio de um sistema que é ajustado especialmente para suas necessidades.\n");
        produto.add(P);
        P = new Produtos(R.drawable.ssd,"Hd Ssd 480gb Kingston","\n \nR$ 349,99","Armazene fotos, videos, musicas e documentos, com muito mais segurança e sem comprometer a memória do seu computador com o SSD Kingston A400 480GB.\n" +
                "\n" +
                "Principais Caracteristicas:\n" +
                "\n" +
                "- Rápida inicialização, carregamento e transferência de arquivos;\n" +
                "- Mais confiável e mais durável do que um disco rígido\n" +
                "- Diversas capacidades com espaço para aplicativos ou para substituição do disco rígido.");
        produto.add(P);
    }
}
