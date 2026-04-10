from multipledispatch import dispatch
class Auto:
    def __init__(self,modelo:str,gasolina:float,color:str):
        self.modelo=modelo
        self.gasolina=gasolina
        self.color=color
    
    @dispatch()
    def mostrar(self):
        print("Gasolina:",self.gasolina)
    
    @dispatch(int)
    def mostrar(self,c:int):
        print("Modelo:",self.modelo)
    
    @dispatch(int,str)
    def mostrar(self,c:int,nom:str):
        print("Color",self.color)
    
    def __pos__(self):
        self.gasolina+=5
        
    def __add__(self, other:str):
        self.color=other
        
    def __sub__(self, other)->float:
        return self.gasolina+other.gasolina




res=6*7
a=res+7

print(a)

