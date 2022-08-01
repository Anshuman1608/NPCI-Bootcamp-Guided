import { Component, OnInit } from '@angular/core';
import { ManagementServiceService } from 'src/app/services/management-service.service';
import { Employee } from 'src/app/common/employee';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {

  employees : Employee[]
  constructor(private service : ManagementServiceService,
    private route : Router,
    private activeRoute : ActivatedRoute) { }

  formModel : Employee = new Employee(0,"","","",0,0,0,0)
  ngOnInit(): void {
    this.activeRoute.paramMap.subscribe(() => {
      this.listOfEmployees()});

  }

  listOfEmployees(){
    this.service.getAllEmployee().subscribe(data =>{
      console.log(data)
      this.employees = data
    })

  }
  addEmpForm(){
    this.route.navigateByUrl("/empform")
  }
  employeeDetails(){
    this.route.navigateByUrl("/employees")
  }
  departmentDetails(){
    this.route.navigateByUrl("/department")
  }
  empForm()
  {
    this.route.navigateByUrl("/empform")
  }
  deptForm()
  {
    this.route.navigateByUrl("/deptform")
  }
  gotoHome()
  {
    this.route.navigateByUrl("/")
  }
}
