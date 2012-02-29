set proj_root=%1

set class_dir=%proj_root%\WebRoot\WEB-INF\classes
set lib_dir=%proj_root%\WebRoot\WEB-INF\lib
set client_dir=%proj_root%\client\classes

\proj_wrksp\userlib\apache-cxf-2.4.6\bin\wsdl2java.bat -d %client_dir% -compile -client -p "com.pace.server.client" http://localhost:8080/pace/app?wsdl

