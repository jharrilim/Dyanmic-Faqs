## Installation
  To install this application, you must first make sure your
  instance of Wildfly has the MySql JDBC driver. If it does
  not have it, you may copy the folder that is provided.
  The folder structure looks like this:
  
  com/mysql/driver/main
  
  This must be added to your ${EAP_HOME}/modules/system/layers/base.
  
  You can navigate to the EAP_HOME by going into Eclipse and right 
  clicking Wildfly in the servers tab, click show in, and click 
  file browser.
  
  Go to the Wildfly/bin directory and open up cmd. With the Wildfly
  server started, run .\jboss-cli.bat --connect.
  An interactive mode should start. Paste this command and press enter:
  
  /subsystem=datasources/jdbc-driver=mysql:add(driver-name=mysql,driver-module-name=com.mysql,driver-xa-datasource-class-name=com.mysql.jdbc.jdbc2.optional.MysqlXADataSource)

  You should now see a success message in both the interactive window 
  and the console in Eclipse showing that the MySQL Driver has been
  installed.

  Official RedHat documentation for this process can be found here:
  https://access.redhat.com/documentation/en-us/jboss_enterprise_application_platform/6/html/administration_and_configuration_guide/install_a_jdbc_driver_as_a_core_module1
  
