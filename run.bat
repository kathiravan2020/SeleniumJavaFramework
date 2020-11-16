set ProjectPath=C:\opt\flexnet\workspace\Kathi_java_project\Java_Lessons

echo %ProjectPath% "C:\opt\flexnet\workspace\Kathi_java_project\Java_Lessons"

set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*

echo %classpath%

java org.testng.TestNG %ProjectPath%\testng.xml