"""
Paragdimas de programacion

Delgado Acosta Luis Bernardo
Grupo. 3BV2
PRACTICA 3
"""

##definimos una funcion lambda que recibe x y suma n = 15
def func_compute(n):
    return lambda x: x + n
result = func_compute(15)
print("Funcion lambda 1: \n")
x= int(input("Ingrese x: ")) #Se lee x con la funcion input, pero se debe de convertir en entero con la funcion int()
print("x + 15 =",result(x))# se muestra el resultado llamando a la funcion lambda y le mandamos el argumento x

## segunda funcion lambdaque recibe dos argumentos y los multiplica
def func_compute2():
    return lambda x2, y: x2 * y
result2= func_compute2()
print("Funcion lambda 2: \n")
# se piden los valores x2 & y, pasa lo mismo, se lee con la funcion input y se convierte en entero
x2 = int(input("\n Ingrese el valor de x2: "))
y = int(input("\n Ingrese el valor de y: "))
print("\n x2 * y= ",result2(x2,y)) #se muestra el resultado llamando a la funcion lambda2 y le mandamos dos argumentos

# se importa la libreria random para generar un numero random 
import random
numAleatorio = random.randint(0,100000) # se genera un numero random entero con rango 0 a 100. se guarda en la variable numAleatorio
# que se utilizara porsteriormente en la tercera funcion lambda
# tercera funcion lambda 
def func_compute3(numAleatorio):
    return lambda x3: x3/numAleatorio
result3= func_compute3(numAleatorio)
print("Funcion lambda 3: ")
x3 = int(input("\n Ingrese un valor x3:"))
print("\n",x3, "/", numAleatorio," = " ,result3(x3)) # se llama la funcion lambda3, se manda el argumento x3

#fin del codigo






