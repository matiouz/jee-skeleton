package soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by mathieu on 14/11/15.
 */
@WebService //@WebService(serviceName="HelloService")
public class MySoapWebService {

    //SOAP web service, available at: http://localhost:8080/webAppTest/MySoapWebService?wsdl
    @WebMethod //@WebMethod(operationName="SayHello")
    public String concat(String s1, String s2){ //@WebParam(name="name")
        return s1 + s2;
    }
}
