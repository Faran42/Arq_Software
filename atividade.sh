#!/bin/bash


if [[ -e /home/brunno/Arq_Software/DivShell01 && /home/brunno/Arq_Software/DivShell02 ]]; then
echo " o diretorio existe"
javac Exemplo.java
java Exemplo
mv /home/brunno/Arq_Software/DivShell01/resultado.txt /home/brunno/Arq_Software/DivShell02
else
echo " o diretorio não existe vamos criar o diretorio"
mkdir DivShell01
mkdir DivShell02
fi
exit