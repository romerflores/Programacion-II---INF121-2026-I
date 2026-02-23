'''
#esto es una cadena
cadena="hola"
print(cadena)

## esto es un entero
numero=5
print(type(numero))

numero="hola"
print(type(numero))


## float
real=3.634534
print(real)

## booleanos
valor_booleano=True
'''
## la lectura simpre se realiza como texto, y ademas lee toda la linea sin importa que hayan espacios
'''cadena=input()
print(cadena)


numero=float(cadena)
print(type(numero))
'''

## escritura



## ejercicio 1, pida un nombre por teclado y salude al usuario

# print("Hola!! ingresa tu nombre")
'''nombre=input('Hola!! ingresa tu nombre:')
## print format:
print(f"Hola {nombre} un saludo!!")
'''

### Problema 1. Leer por teclado una temperatura con decimales en grados C, e imprimir su conversion a grados kelvin:



'''grados_c=float(input('Ingrese la temperatura en grados C:'))

kelvin=grados_c+273.15
print(f"{grados_c} en kelvin es igual a {kelvin:.2f}")'''


'''### Estructuras de control de flujo:Condicionales

## condicional simple
if False:
    # si la condicion es verdarea se ejecuta el codigo
    print("Se cumple")
    
## condicional doble
if False:
    # si la condicion es verdarea se ejecuta el codigo
    print("Se cumple")
else:
    # si la condicion no es verdarea se ejecuta este codigo
    print("No se cumple")
    
    
## condicional Multiple
if True:
    # si la condicion es verdarea se ejecuta el codigo
    print("Se cumple")
elif True:
    print("")
elif True:
    pass
elif True:
    pass
else:
    pass'''


## leer tres numeros por teclado en diferntes lineas, y postrarlos ordenados, solo usando condiciononales
    

'''a,b,c=map(int,input().split())
print(sorted(list({a,b,c})))'''

'''a=int(input())
b=int(input())
c=int(input())

if a<=b and a<=c:
    if b<=c:print(a,b,c)
    else:print(a,c,b)
elif b<=a and b<=c:
    if a<=c:print(b,a,c)
    else:print(b,c,a)
else:
    if a<=b:print(c,a,b)
    else:print(c,b,a)'''
    
    
## estructuras de control de Flujo:Ciclos Repetitivos


## Ciclo for
'''
vec=[1,2,3,4,5,6]
## un parametro indica solo el fin desde en el rango [0:n)
for i in range(10):## [0,10)
    pass

## dos parametro indica el inicio y el fin en el rango [inicio:fin)
for i in range(1,10+1):## [1:11)
    pass

## tres parametros indica el inicio, el fin y los saltos(v) en el rango [inicio:fin) de salto v en v
for i in range(2,11+1,2):
    print(i)
    
    '''
## WHILE ,do while no existe en python

'''while True:
    print(3)
    break
'''

## dado un lote de N numeros, mostrar el resultado de la suma de todos los numeros que este en el rango [l,r], donde se cumple que r es menor igual que n, y r mayor igual l

# ejemplo
n=int(input())
l=int(input())
r=int(input())
## leer lote:
suma=0
for i in range(1,n+1):
    num=int(input())
    if l<=i<=r:suma+=num
print(suma)





