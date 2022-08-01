import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, map } from 'rxjs' ;
import { Employee } from '../common/employee';
import { Department } from '../common/department';

@Injectable({
  providedIn: 'root'
})
export class ManagementServiceService {

  private empurl = "http://localhost:8080/api/emp"
  private depturl = "http://localhost:8080/api/departments"
  constructor(private httpClient : HttpClient) { }
  getAllEmployee() : Observable<Employee[]>{
    return this.httpClient.get<getEmployeeResponse>(this.empurl).pipe(map((response=> response._embedded.employees)));
  }
  getAllDepartments() : Observable<Department[]>{
    return this.httpClient.get<getDepartmentResponse>(this.depturl).pipe(map(response => response._embedded.departments));
  }
  saveEmployee(employee : Employee)
  {
    console.log(employee)

    const httpOptions =
    {
      headers : new HttpHeaders
      ({
        'Content-type' : 'application/json',
        'Authorization' : 'auth-token',
        'Access-Control-Allow-Origin' : '*'
      })
    };
    return this.httpClient.post<Employee>(this.empurl,employee,httpOptions)
  }
  saveDepartment(department : Department)
  {
    console.log(department)

    const httpOptions =
    {
      headers : new HttpHeaders
      ({
        'Content-type' : 'application/json',
        'Authorization' : 'auth-token',
        'Access-Control-Allow-Origin' : '*'
      })
    };
    return this.httpClient.post<Department>(this.depturl,department,httpOptions)
  }
}

interface getEmployeeResponse{
  _embedded : {
    employees : Employee[]
  }
}
interface getDepartmentResponse{
  _embedded : {
    departments : Department[]
  }
}
