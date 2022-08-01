import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/common/employee';
import { Department } from 'src/app/common/department';
import { DeptListComponent } from '../dept-list/dept-list.component';
import { ManagementServiceService } from 'src/app/services/management-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-emp-form',
  templateUrl: './emp-form.component.html',
  styleUrls: ['./emp-form.component.css']
})
export class EmpFormComponent implements OnInit {
  employee : Employee = new Employee(0,"","","",0,0,0,0)
  departments : Department[]
  constructor(private service : ManagementServiceService, private route : Router) { }

  ngOnInit(): void {
    this.listOfDepartments()
   }
  onSubmit(): void{


      this.service.saveEmployee(this.employee).subscribe(() =>{
        this.route.navigateByUrl("/employees")
      })

    // this.employees.push(this.formModel)
  }
  listOfDepartments(){
    this.service.getAllDepartments().subscribe(data => {
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
  gotoHome(){
    this.route.navigateByUrl("/")
  }

}
