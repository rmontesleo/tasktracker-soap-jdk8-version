
package com.example.demo.soap.client.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TaskTrackerPort", targetNamespace = "http://www.soap.demo.example.com/api/taskTracker")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TaskTrackerPort {


    /**
     * 
     * @param deleteTaskRequest
     * @return
     *     returns com.example.demo.soap.client.generated.DeleteTaskResponse
     */
    @WebMethod
    @WebResult(name = "deleteTaskResponse", targetNamespace = "http://www.soap.demo.example.com/api/taskTracker", partName = "deleteTaskResponse")
    public DeleteTaskResponse deleteTask(
        @WebParam(name = "deleteTaskRequest", targetNamespace = "http://www.soap.demo.example.com/api/taskTracker", partName = "deleteTaskRequest")
        DeleteTaskRequest deleteTaskRequest);

    /**
     * 
     * @param getTaskByIdRequest
     * @return
     *     returns com.example.demo.soap.client.generated.GetTaskByIdResponse
     */
    @WebMethod
    @WebResult(name = "getTaskByIdResponse", targetNamespace = "http://www.soap.demo.example.com/api/taskTracker", partName = "getTaskByIdResponse")
    public GetTaskByIdResponse getTaskById(
        @WebParam(name = "getTaskByIdRequest", targetNamespace = "http://www.soap.demo.example.com/api/taskTracker", partName = "getTaskByIdRequest")
        GetTaskByIdRequest getTaskByIdRequest);

    /**
     * 
     * @param addTaskRequest
     * @return
     *     returns com.example.demo.soap.client.generated.AddTaskResponse
     */
    @WebMethod
    @WebResult(name = "addTaskResponse", targetNamespace = "http://www.soap.demo.example.com/api/taskTracker", partName = "addTaskResponse")
    public AddTaskResponse addTask(
        @WebParam(name = "addTaskRequest", targetNamespace = "http://www.soap.demo.example.com/api/taskTracker", partName = "addTaskRequest")
        AddTaskRequest addTaskRequest);

    /**
     * 
     * @param updateTaskRequest
     * @return
     *     returns com.example.demo.soap.client.generated.UpdateTaskResponse
     */
    @WebMethod
    @WebResult(name = "updateTaskResponse", targetNamespace = "http://www.soap.demo.example.com/api/taskTracker", partName = "updateTaskResponse")
    public UpdateTaskResponse updateTask(
        @WebParam(name = "updateTaskRequest", targetNamespace = "http://www.soap.demo.example.com/api/taskTracker", partName = "updateTaskRequest")
        UpdateTaskRequest updateTaskRequest);

    /**
     * 
     * @param getAllTasksRequest
     * @return
     *     returns com.example.demo.soap.client.generated.GetAllTasksResponse
     */
    @WebMethod
    @WebResult(name = "getAllTasksResponse", targetNamespace = "http://www.soap.demo.example.com/api/taskTracker", partName = "getAllTasksResponse")
    public GetAllTasksResponse getAllTasks(
        @WebParam(name = "getAllTasksRequest", targetNamespace = "http://www.soap.demo.example.com/api/taskTracker", partName = "getAllTasksRequest")
        GetAllTasksRequest getAllTasksRequest);

}
