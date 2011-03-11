set proj_root=%1

set class_dir=%proj_root%\WebRoot\WEB-INF\classes
set lib_dir=%proj_root%\WebRoot\WEB-INF\lib
set client_dir=%proj_root%\client\classes

\java\userlib\apache-cxf-2.2.5\bin\wsdl2java.bat -d %client_dir% -compile -client -p "com.palladium.paf.server.client" http://localhost:8080/PafServer/PafService?wsdl

