#!/bin/bash

clear
proj_root="$PWD"
user_lib=$HOME/userlib
class_dir=$proj_root/WebRoot/WEB-INF/classes
dist_dir=$proj_root/client/dist
mavenlib_dir=$HOME/.m2/repository
classpath="$dist_dir/pace-base.jar:$class_dir:$mavenlib_dir/log4j/log4j/1.2.16/log4j-1.2.16.jar:$mavenlib_dir/org/nfunk/jep/jep-main/2.4/jep-main-2.4.jar"


echo "proj_root=$proj_root"
echo "user_lib=$user_lib"
echo "class_dir=$class_dir"
echo "dist_dir=$dist_dir"
echo "mavenlib_dir=$mavenlib_dir"
echo "classpath=$classpath"

#echo
#echo $user_lib/apache-cxf-2.4.6/bin/java2ws -wsdl -o $proj_root/WebRoot/WEB-INF/PafServiceProviderService.wsdl -address http://localhost:8080/pace/PafServiceProvider -cp $classpath com.pace.server.PafServiceProvider
echo
$user_lib/apache-cxf-2.4.6/bin/java2ws -verbose -wsdl -o $proj_root/WebRoot/WEB-INF/PafServiceProviderService.wsdl -address http://localhost:8080/pace/PafServiceProvider -cp $classpath com.pace.server.PafServiceProvider

