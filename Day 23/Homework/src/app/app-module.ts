import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { EmployeeComponent } from './employee-component/employee-component';
import { StudentSystem } from './student-system/student-system';
import { ProductCatalog } from './product-catalog/product-catalog';
import { CompanyDashboard } from './company-dashboard/company-dashboard';
import { FormArrayDirective, FormsModule } from '@angular/forms';
import { RegistrationForm } from './registration-form/registration-form';
import { Counter } from './counter/counter';

@NgModule({
  declarations: [
    App,
    EmployeeComponent,
    StudentSystem,
    ProductCatalog,
    CompanyDashboard,
    RegistrationForm,
    Counter,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [provideBrowserGlobalErrorListeners()],
  bootstrap: [App],
})
export class AppModule {}
