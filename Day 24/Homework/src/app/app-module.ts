import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { EmployeeComponent } from './employee-component/employee-component';
import { ProductCatalog } from './product-catalog/product-catalog';
import { StudentResult } from './student-result/student-result';
import { EmployeeForm } from './employee-form/employee-form';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [App, EmployeeComponent, ProductCatalog, StudentResult, EmployeeForm],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [provideBrowserGlobalErrorListeners()],
  bootstrap: [App],
})
export class AppModule {}
