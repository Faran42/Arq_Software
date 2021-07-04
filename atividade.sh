#!/bin/bash


if [[ -e /home/faran/as/DivShell01 && /home/faran/as/DivShell02 ]]; then
echo "diretorio existe"

echo "Arg_1"
read n1

echo "Arg_2"
read n2

echo "Operação"

read op   

javac exemplo.java
java exemplo $n1 $n2 $op
mv /home/faran/as/DivShell01/resultado.txt /home/faran/as/DivShell02
else
echo "diretorio não existe "
mkdir DivShell01
mkdir DivShell02
fi
exit