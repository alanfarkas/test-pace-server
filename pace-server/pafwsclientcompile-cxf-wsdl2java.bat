set proj_root=%1
set user_lib=C:\java\userlib
set class_dir=%proj_root%\WebRoot\WEB-INF\classes
set lib_dir=%proj_root%\WebRoot\WEB-INF\lib
set client_dir=%proj_root%\client\classes

%user_lib%\apache-cxf-2.4.6\bin\wsdl2java.bat -d %client_dir% -compile -client -p "com.pace.server.client" %proj_root%\WebRoot\WEB-INF\pafservice.wsdl

