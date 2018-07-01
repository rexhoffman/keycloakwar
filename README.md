[![codebeat badge](https://codebeat.co/badges/83cad6ad-4368-4484-bb4f-bb3cbee36899)](https://codebeat.co/projects/github-com-rexhoffman-java-keyring-master)
[![codecov](https://codecov.io/gh/rexhoffman/java-keyring/branch/master/graph/badge.svg)](https://codecov.io/gh/rexhoffman/java-keyring)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/96803c08ce79466e9255ed5e713a0c60)](https://www.codacy.com/app/rexhoffman/java-keyring?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=rexhoffman/java-keyring&amp;utm_campaign=Badge_Grade)

keycloakwar
=============

get key cloak working in jetty/tomcat

for jetty run the one unit test.

for tomcat

mvn clean tomcat7:run-war

Status:

Database is good (h2 jpa config without jta/persistence xml) via undocumented config options... see json xml

Welcome page comes up.

Visiting the admin results in an error, something is make the url contain an extra slash after server port....

so

http://localhost:55808//realms/master/tokens/login?....

instead of 

http://localhost:55808/realms/master/tokens/login?....

If you manually edit that url to remove the slash you can login and change the admin password

After that a redirects back to http://localhost:55808//realms break the app.

No luck finding the source of the issue thus far.

