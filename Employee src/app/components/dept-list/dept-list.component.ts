import { Component, OnInit } from '@angular/core';
import { ManagementServiceService } from 'src/app/services/management-service.service';
import { Department } from 'src/app/common/department';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dept-list',
  templateUrl: './dept-list.component.html',
  styleUrls: ['./dept-list.component.css']
})
export class DeptListComponent implements OnInit {

  departments : Department[]
  constructor(private Service : ManagementServiceService,
    private route : Router) { }
  formModel : Department = new Department(0,"","")
  ngOnInit(): void {
    this.listOfDepartments()
  }
  onSubmit(): void{
    this.departments.push(this.formModel)
  }
  listOfDepartments(){
    this.Service.getAllDepartments().subscribe(data => {
      console.log(data)
      this.departments = data
    })
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
