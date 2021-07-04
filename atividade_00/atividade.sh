#!/bin/bash

echo "Digite um numero"
  read num1
echo "Digite outro numero"
 read num2

echo "Escolha uma opção:"
echo "1 - Somar "
echo "2 - Subtrair "
echo "3 - Multiplicar "
echo "4 - Dividir "
  read equacao

if [ $equacao -eq 1 ]; then
  resultado=$[num1+num2]
elif [ $equacao -eq 2 ]; then
  resultado=$[num1-num2]
elif [ $equacao -eq 3 ]; then
  resultado=$[num1*num2]
elif [ $equacao -eq 4 ]; then
  resultado=$[num1/num2]
else
  echo "Opção inválida."
fi

echo "O resultado é: $resultado"