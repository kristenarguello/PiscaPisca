# PiscaPisca
Estava eu, junto a um arquiteto aparentemente renomado, sentado em um banco do aeroporta Salgado Filho esperando nosso voo para Maceió.
Era na semana do natal e o voo atrasou. Íamos ficar 5 horas fazendo altos nada :))))))
Enquanto o arquiteto ficou tentando desenhar o número de degraus da escada rolante do nosso lado eu tentei fazer algo mais de gente grande!
Como era uma semana de natal havia uma tela de leds 10x10 que ficavam ligando e desligando. E a cada segundo os leds mudavam e consequentemente mudava o "desenho" que havia na tela.
Então eu decidi contar quantas leds eu enxerguei acessa durante 100 segundos. Assim pensei em criar um programa para me ajudar no processo (porque tirar 100 fotos pra ficar contando as luzes não é o meu forte).
Por sorte tinha um segurança do meu lado e pasmem: Foi ele quem criou o painel! E como ele é muito legal ele me contou como funcionava o painel.

Ele me disse que era para eu pensar em cada led como se fosse um número, então um painel de exemplo seria esse:

5483143223
2745854711
5264556173
6141336146
6357385478
4167524645
2176841721
6882881134
4846848554
5283751526


E a cada segundo o painel mudava com as seguites regras:
	* Cada número aumenta em 1
	* Após isso todos os números que forem maior que 9 piscam,
	fazendo com os números em volta dele aumentem em 1
	* Após as "piscagens" todos os números que piscaram são definidos para 0

Vale a pena lembrar que leds que piscaram, quando aumentam 1 para seus vizinhos,
também podem fazê-los piscarem (que também podem fazer os seus vizinhos piscarem e assim gerando uma possível reação em cadeia).

O "segundo" só acaba quando não há mais luzes a "serem piscadas" e assim sendo possível por para a última regra descrita.
Lembrando que as regras estão descritas em uma ordem e essa ordem precisa ser seguida.

A seguir há os 4 segundos do painel usado acima:

Segundo 1:
6594254334
3856965822
6375667284
7252447257
7468496589
5278635756
3287952832
7993992245
5957959665
6394862637

Segundo 2:
8807476555
5089087054
8597889608
8485769600
8700908800
6600088989
6800005943
0000007456
9000000876
8700006848

Segundo 3:
0050900866
8500800575
9900000039
9700000041
9935080063
7712300000
7911250009
2211130000
0421125000
0021119000

Segundo 4:
2263031977
0923031697
0032221150
0041111163
0076191174
0053411122
0042361120
5532241122
1532247211
1132230211

INPUT:
1224346384
5621128587
6388426546
1556247756
1451811573
1832388122
2748545647
2582877432
3185643871
2224876627
