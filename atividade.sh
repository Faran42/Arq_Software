#!/bin/bash


if [[ -e /home/brunno/Arq_Software/DivShell01 && /home/brunno/Arq_Software/DivShell02 ]]; then
echo " o diretorio existe"

echo "Parâmetro 1"
read num1
echo " Parâmetro 2"
read num2
echo "Operação"
read op   
javac Exemplo.java
java Exemplo $num1 $num2 $op
mv /home/brunno/Arq_Software/DivShell01/resultado.txt /home/brunno/Arq_Software/DivShell02
else
echo " o diretorio não existe vamos criar o diretorio"
mkdir DivShell01
mkdir DivShell02
fi
exit