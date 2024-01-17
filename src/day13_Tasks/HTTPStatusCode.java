package day13_Tasks;
/*
HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers).
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
 Some of the codes and their meanings are listed below:

 */
public class HTTPStatusCode {
    public static void main(String[] args) {
        int status = 200;
        String code = "";
        switch(status) {
            case 200:
                code = "OK";
                break;
            case 201:
                code = "Created";
                break;
            case 202:
                code = "Accepted";
                break;
            case 301:
                code = "Moved Permanently";
                break;
            case 303:
                code = " See Other";
                break;
            case 304:
                code = "Not Modified";
                break;
            case 307:
                code = "Temporary Redirect";
                break;
            case 400:
                code = "Bad Request";
                break;
            case 401:
                code = "Unauthorized";
                break;
            case 403:
                code = "Forbidden";
                break;
            case 404:
                code = "Not Found";
                break;
            case 410:
                code = "Gone";
                break;
            case 500:
                code = "Internal Server Error";
                break;
            case 503:
                code = "Service Unavailable";
                break;
            default:
                code = "Invalid Status Code";
        }
        System.out.println(code);
    }
}
