;#TIMER 10, 9, 8 ... 0

000 LOAD M(0100)	;#repetir n vezes                              000 01 0100 06 0101
001 SUB M(0101)		;#i=i-1
002 STOR M(0102)	;#armazena AC para este endereco de memoria    001 21 0102 0F 000
003 JUMP+ (000,20:39)		;#pula para o comec	

100	00 00 00 00 0A;#variavel i = 10 para ser contador
101	00 00 00 00 01;#constante 1
102 00 00 00 00 00;#variavel timer

;000 01 100 06 101
;001 21 102 01 102
;002 10 000 00 000
;100	00 00 00 00 0a
;101	00 00 00 00 01
;102 00 00 00 00 00