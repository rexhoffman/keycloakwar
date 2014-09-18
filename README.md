keycloakwar
=============

get key cloak working in jetty/tomcat

for jetty run the one unit test.

for tomcat

mvn clean tomcat7:run-war

Status:

Database is good (h2 jpa config without jta/persistence xml) via undocumented config options... see json xml

Welcom page comes up.

Visiting the admin results in an error, something is make the url contain an extra slash after server port....

so

http://localhost:55808//realms/master/tokens/login?....

instead of 

http://localhost:55808/realms/master/tokens/login?....

If you manually edit that url to remove the slash you can login and change the admin password

After that a redirects back to http://localhost:55808//realms break the app.

No luck finding the source of the issue thus far.

