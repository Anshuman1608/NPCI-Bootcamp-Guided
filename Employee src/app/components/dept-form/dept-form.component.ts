import { Component, OnInit } from '@angular/core';
import { Department } from 'src/app/common/department';
import { Router } from '@angular/router';
import { ManagementServiceService } from 'src/app/services/management-service.service';

@Component({
  selector: 'app-dept-form',
  templateUrl: './dept-form.component.html',
  styleUrls: ['./dept-form.component.css']
})
export class DeptFormComponent implements OnInit {

  department : Department = new Department(0,"","")
  constructor(private service : ManagementServiceService, private route : Router) { }

  ngOnInit(): void {
  }

  onSubmit(): void{


    this.service.saveDepartment(this.department).subscribe(() =>{
      this.route.navigateByUrl("/department")
    })

  // this.employees.push(this.formModel)
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
  gotoHome(){
    this.route.navigateByUrl("/")
  }
}
