class Hora:

    def __init__(self,horas=0,minutos=0,segundos=0):
        self.horas=horas
        self.minutos=minutos
        self.segundos=segundos
    
    def getHoras(self):
         return self._horas

    def get_minutos(self):
        return self._minutos

    def get_segundos(self):
        return self._segundos
    
    def set_horas(self, horas):
        self._horas = horas
    
    def set_minutos(self, minutos):
        self._minutos = minutos

    def set_segundos(self, segundos):
        self._segundos = segundos

    def str(self):
        return f"{self.horas}:{self.minutos}:{self.segundos}"

    def convertir_a_segundos(self):
        return self.horas * 3600 + self.minutos * 60 + self.segundos

    def compareTo(self, otra_hora):
        return self.convertir_a_segundos() - otra_hora.convertir_a_segundos()

    def sumar_segundos(self, segundos):
        total_segundos = self.convertir_a_segundos() + segundos