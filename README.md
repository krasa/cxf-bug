# cxf-bug 
###https://issues.apache.org/jira/browse/CXF-6376

Unexpected exception thrown from ResponseHandler is swallowed and status code 200 is returned


* mvn jetty:run
* GET http://localhost:8080/cxf/rest/foo
* -> 200 is returned, while the log prints javax.ws.rs.NotFoundException, but no mention about the exception which occured inside the ResponseHandler
