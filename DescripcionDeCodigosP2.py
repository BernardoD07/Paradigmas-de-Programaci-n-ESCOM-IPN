


## definicion de una funcion donde se declara n, y se retorna lambda x: x*n
## x es el argumento que se ingresará cuando se llame a la funcion 

def func_compute(n):
    return lambda x: x*n
result = func_compute(2) ##result es una variable que guarda la funcion con valor 3=n
print ("Double the number of 15 = ", result(15))## te muestra el doble del argumento 15=x


subject_marks = [('English',88), ('Science',90),('Maths',97),
('Social sciences',82)] #Arreglo de varios datos 
print("Original list of tuples: ")
print(subject_marks)#imprime el arreglo
subject_marks.sort(key = lambda x:x[1]) #sort "ordena" el arreglo
# key especifica una funcion de un argumento que es empleada para extraer
# una clave de comparacion de cada elemento en iterable
print("\n Result: ")
print(subject_marks)


nums = [1,2,3,4,5,6,7,8,9,10] ##areglo de enteros
print("Original list of integers :")
print(nums)
print("\n numbers from the said list: ")
even_nums = list(filter(lambda x: x%2 == 0, nums))#sintaxis  filter (funcion, iterable )
# primero filtra los numero pares, despues lo pasa como lista
print(even_nums)
print ("\n numbers from the said list: ")
odd_nums = list(filter(lambda x: x%2 !=0,nums)) # primero filtra los numeros impares, despues lo pasa como lista
print(odd_nums)


nums = [1,2,3,4,5,6,7,8,9,10]
print("Original list of integers: ")
print(nums)
print("\n number of the said list: ")
square_nums = list(map(lambda x:x**2, nums))## la funcion map nos permite aplicar una funcion sobre los items de un objeto
##posteriormente se convierte a una lista 
#la funcion lambda  recibe un valor x y lo eleva al cuadrado
print(square_nums) 
print("\n every number of the said list: ")
cube_nums = list(map(lambda x:x**3, nums)) ## lambda recibe un valor x y lo eleva a la tercera
print(cube_nums)



starts_with = lambda x: True if x.startswith('P') else False
print(starts_with('Python'))
starts_with = lambda x: True if x.startswith('P') else False
print(starts_with('Java')) 
# lambda recibe una string y aplica una condicion, si existe una p en el string será True sino False

import datetime 
now = datetime.datetime.now()
print(now)
# saca el tiempo al momento y lo divide por año, mes, día 
year = lambda x: x.year
month = lambda x:  x.month
day= lambda x: x.day
t = lambda x: x.time() #hora
print(year(now))
print(month(now))
print(day(now))
print(t(now))





