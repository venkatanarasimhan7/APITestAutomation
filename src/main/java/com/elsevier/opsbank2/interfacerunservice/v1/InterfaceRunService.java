package com.elsevier.opsbank2.interfacerunservice.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2022-01-11T14:06:58.109+05:30
 * Generated source version: 3.4.5
 *
 */
@WebService(targetNamespace = "http://www.elsevier.com/opsbank2/interfacerunservice/v1", name = "InterfaceRunService")
@XmlSeeAlso({ObjectFactory.class, com.elsevier.opsbank2.interfacerun.v1.ObjectFactory.class, org.xmlsoap.schemas.soap.envelope.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface InterfaceRunService {

    @WebMethod(operationName = "SubmitRunInterface", action = "submitRunInterface")
    @WebResult(name = "runInterfaceResponse", targetNamespace = "http://www.elsevier.com/opsbank2/interfacerunservice/v1", partName = "parameters")
    public RunInterfaceResponse submitRunInterface(

        @WebParam(partName = "parameters", name = "runInterface", targetNamespace = "http://www.elsevier.com/opsbank2/interfacerunservice/v1")
        RunInterface parameters
    );

    @WebMethod(operationName = "UpdateInterfaceRun", action = "updateInterfaceRun")
    @WebResult(name = "updateInterfaceRunResponse", targetNamespace = "http://www.elsevier.com/opsbank2/interfacerunservice/v1", partName = "parameters")
    public UpdateInterfaceRunResponse updateInterfaceRun(

        @WebParam(partName = "parameters", name = "updateInterfaceRun", targetNamespace = "http://www.elsevier.com/opsbank2/interfacerunservice/v1")
        UpdateInterfaceRun parameters
    );
}
