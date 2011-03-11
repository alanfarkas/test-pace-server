set proj_root=\proj_wrksp\eclipse\PafServer
set class_dir=%proj_root%\WebRoot\WEB-INF\classes
set lib_dir=%proj_root%\WebRoot\WEB-INF\lib
set client_dir=%proj_root%\client\classes

\java\sun\jwsdp-1.6\jaxrpc\bin\wscompile.bat -cp "%class_dir%;%lib_dir%\esbprv.jar;%lib_dir%\paf_base.jar" -d %client_dir% -gen:client -f:documentliteral -mapping %proj_root%\WebRoot\WEB-INF\jaxrpc-mapping-client.xml %proj_root%\client-config.xml
