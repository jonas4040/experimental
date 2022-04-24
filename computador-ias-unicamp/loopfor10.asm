#contador--
LOAD M(0x102) SUB M(0x103)
#armazena novo valor na memória e salta para o comeco
STOR M(0x102) JUMP M(000,0:19)

102 00 00 00 00 09 # Contador
103 00 00 00 00 01 # Constante 1