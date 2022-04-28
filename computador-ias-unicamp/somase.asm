000 LOAD M(0FB) ; SUB (0FA)
001 JUMP+ M(003, 1:19) ; LOAD M(0FB) #zera o acc ou tenta colocar o n2 direto
002 ADD M(0FA) ; STOR M(0FC) #soma e guarda
003 NOP

000 01 0fb 06 0fa
001 10 001 01 0fb
002 05 0fa 21 0fc
