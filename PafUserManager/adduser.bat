@echo off

echo Adding user: %1

"%JAVA_HOME%\bin\java.exe" -cp "..\db\lib\derby.jar;PafUserManager.jar" com.palladium.paf.usermanager.PafUserManager %1 %2 %3 %4 %5 %6 %7

pause
