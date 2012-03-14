set proj_root=%1
set user_lib=C:\java\userlib
set class_dir=%proj_root%\WebRoot\WEB-INF\classes
set dist_dir=%proj_root%\client\dist
set mavenlib_dir=%USERPROFILE%\.m2\repository

%user_lib%\apache-cxf-2.4.6\bin\java2ws.bat -wsdl -o %proj_root%\WebRoot\WEB-INF\pafservice.wsdl -cp %class_dir%;%dist_dir%\pace-base.jar;%mavenlib_dir%\log4j\log4j\1.2.16\log4j-1.2.16.jar;%mavenlib_dir%\org\nfunk\jep\jep-main\2.4\jep-main-2.4.jar com.pace.server.PafServiceProvider


