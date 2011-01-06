@echo off

echo.

"%JAVA_HOME%\bin\java.exe" -cp "%PafServerHome%\lib\log4j-1.2.9.jar;%PafServerHome%\lib\xstream-1.1.2.jar;%PafServerHome%\lib\xpp3-1.1.3.4d-b4_min.jar;%PafServerHome%\lib\paf_base.jar;%PafServerHome%\bin\PafUtilities.jar" com.palladium.paf.validator.PafXmlValidator %1

echo.

pause
