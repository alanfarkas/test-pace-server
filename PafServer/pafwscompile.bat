set proj_root=\proj_wrksp\eclipse\PafServer
set class_dir=%proj_root%\WebRoot\WEB-INF\classes
set lib_dir=%proj_root%\WebRoot\WEB-INF\lib

\java\sun\jwsdp-1.6\jaxrpc\bin\wscompile.bat -cp "%class_dir%;%lib_dir%\esbprv.jar;%lib_dir%\paf_base.jar;%lib_dir%\jep-2.4.0.jar" -d %class_dir% -gen:server -f:documentliteral -mapping %proj_root%\WebRoot\WEB-INF\jaxrpc-mapping.xml %proj_root%\config.xml