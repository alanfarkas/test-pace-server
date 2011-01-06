@echo off

echo.

"%JAVA_HOME%\bin\java.exe" -cp "..\lib\log4j-1.2.9.jar;..\lib\xstream-1.1.2.jar;..\lib\xpp3-1.1.3.4d-b4_min.jar;..\lib\paf_base.jar;..\bin\PafUtilities.jar" com.palladium.paf.utils.ElapsedPeriodUpdateUtil

echo.

pause
