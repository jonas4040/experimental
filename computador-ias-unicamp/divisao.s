#programa para dividir  100/2
LOAD M(0x100)			#carrega 100 no registrador acumulador(AC)
DIV M(0x101)			#divide 100/2 armazena o resultado em MQ
LOAD MQ					#copia MQ para AC
STOR M(0x102)			#armazena o resultado no endereco 0x102 da memoria
0100 00 00 00 00 64
0101 00 00 00 00 02
