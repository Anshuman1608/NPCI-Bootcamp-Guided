import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { EmpListComponent } from './components/emp-list/emp-list.component';
import { DeptListComponent } from './components/dept-list/dept-list.component';
import { Routes, RouterModule } from '@angular/router';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { FormsModule } from '@angular/forms';
import { EmpFormComponent } from './components/emp-form/emp-form.component';
import { DeptFormComponent } from './components/dept-form/dept-form.component';
const route : Routes = [
  {path : '', component : WelcomeComponent},
  {path : 'employees', component : EmpListComponent},
  {path : 'department', component : DeptListComponent},
  {path : 'empform', component : EmpFormComponent},
  {path : 'deptform', component : DeptFormComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    EmpListComponent,
    DeptListComponent,
    WelcomeComponent,
    EmpFormComponent,
    DeptFormComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(route),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
