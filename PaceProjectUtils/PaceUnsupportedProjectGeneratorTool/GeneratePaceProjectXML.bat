@echo off

for /f "tokens=1-4 delims=/ " %%i in ("%date%") do (
  set dow=%%i
  set month=%%j
  set day=%%k
  set year=%%l
)

for /f "tokens=1-4 delims=.: " %%i in ("%time%") do (
 set hour=%%i
 set minute=%%j
 set second=%%k
 set hundredth=%%l
)

"%JAVA_HOME%\bin\java.exe" -jar "xml-generation-unsupported.jar" ".\pace files\selfridges.xls" > ".\pace files\pace_file_output_%year%%month%%day%T%hour%%minute%%second%.%hundredth%.txt"

pause