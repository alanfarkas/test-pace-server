@echo off

echo.

"%JAVA_HOME%\bin\java.exe" -cp "..\lib\log4j-1.2.16.jar;..\lib\xstream-1.4.2.jar;..\lib\xpp3_min-1.1.4c.jar;..\lib\xmlpull-1.1.3.1.jar;..\lib\javaee-api-5.0-1.jar;..\lib\pace-base.jar;.\PafUtilities.jar" com.palladium.paf.utils.ElapsedPeriodUpdateUtil

echo.

pause
