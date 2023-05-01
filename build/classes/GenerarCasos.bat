@echo off

rem Especifica la versión de Java utilizada para compilar y ejecutar la clase
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_301
set PATH=%JAVA_HOME%\bin;%PATH%

rem Compila las clases
javac -source 1.8 -target 1.8 GeneradorCasosPrueba.java
javac -source 1.8 -target 1.8 Main.java

rem Ejecuta el GeneradorCasosPrueba y redirecciona la salida a un archivo
java GeneradorCasosPrueba > CasosGenerados.txt

rem Ejecuta el Main con los casos generados y redirecciona la salida a otro archivo
java Main < CasosGenerados.txt > Salidas.txt

echo Finalizado.
pause
