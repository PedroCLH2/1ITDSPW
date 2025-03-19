 #Algoritmo: Conversao_Reais_Dolares
import os
os.system('cls')

reais = 0
cotacao_dolar= 0
conversao = 0

print("Bem vindo ao Programa para converter!!!\n")
reais = float(input("Digite o valor que quer converter (Em Reais): \n"))
cotacao_dolar = float(input("Digite o valor da cotação do dolar de hoje: \n"))

conversao = reais/cotacao_dolar

print("Com esta quantia é possível comprar")
print(round (conversao,2))
print(' dolares')

print('obrigao por usar nosso programa')
