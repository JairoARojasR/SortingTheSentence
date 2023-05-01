@echo off
echo Generando y Probando los Casos.
java GeneradorCasosPrueba.java > CasosGenerados.txt
java Main.java < CasosGenerados.txt > Salidas.txt
echo Finalizado.
pause