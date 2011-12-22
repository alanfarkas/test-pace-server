@echo off

echo.

"%JAVA_HOME%\bin\java.exe" -cp "%PafServerHome%\lib\log4j-1.2.16.jar;%PafServerHome%\lib\xstream-1.4.2.jar;%PafServerHome%.\lib\xpp3_min-1.1.4c.jar;%PafServerHome%\lib\xmlpull-1.1.3.1.jar;%PafServerHome%\lib\javaee-api-5.0-1.jar;%PafServerHome%\lib\pace-base.jar;.\PafUtilities.jar" com.palladium.paf.utils.ElapsedPeriodUpdateUtil

echo.

pause
