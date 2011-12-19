@echo off

echo.

"%JAVA_HOME%\bin\java.exe" -cp "%PafServerHome%\lib\log4j-1.2.16.jar;%PafServerHome%\lib\xstream-1.4.2.jar;%PafServerHome%\lib\xpp3_min-1.1.4c.jar;%PafServerHome%\lib\pace-base.jar;%PafServerHome%\bin\PafUtilities.jar" com.palladium.paf.validator.PafXmlValidator %1

echo.

pause
